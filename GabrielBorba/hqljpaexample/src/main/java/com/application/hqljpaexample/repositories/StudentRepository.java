package com.application.hqljpaexample.repositories;

import com.application.hqljpaexample.entities.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

    @Query("select s from Student s")
    public List<Student> findAllUsers();

    @Query("select s from Student s where s.id = :studentId")
    public Student findUserById(@Param("studentId") Long studentId);


    @Modifying
    @Transactional
    @Query(value = "insert into student (name, password) VALUES  (:name, :password)", nativeQuery = true )
    public void createUser(@Param("name") String name, @Param("password") String password);




    @Modifying
    @Transactional
    @Query(value = "UPDATE Student SET Student.password = :newPassword WHERE Student.id = :id", nativeQuery = true)
    public void updateStudent(@Param("newPassword") String newPassword,
                                 @Param("id") Long id);


    @Modifying
    @Transactional
    @Query(value = "delete from Student  where  Student.id =:id", nativeQuery = true)
    public void deleteUserById(@Param("id") Long id);

}
