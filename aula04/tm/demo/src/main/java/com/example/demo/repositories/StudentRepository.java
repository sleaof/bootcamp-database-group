package com.example.demo.repositories;

import com.example.demo.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    @Query(value = "select * from student s where s.student_id = :studentId", nativeQuery = true)
    public StudentEntity findByStudentId(@Param("studentId") Long studentId);

    @Query(value = "select * from student", nativeQuery = true)
    public List<StudentEntity> findAllStudents();

    @Modifying
    @Transactional
    @Query(value = "insert into student (student_name) values (:name)", nativeQuery = true)
    public void createStudent(@Param("name") String name);

    @Modifying
    @Transactional
    @Query(value = "update student s set s.student_name = :name where s.student_id = :id", nativeQuery = true)
    public void updateStudentName(@Param("id") Long id, @Param("name") String name);

    @Modifying
    @Transactional
    @Query(value = "delete from student s where s.student_id = :id", nativeQuery = true)
    public void deleteStudent(@Param("id") Long id);

}
