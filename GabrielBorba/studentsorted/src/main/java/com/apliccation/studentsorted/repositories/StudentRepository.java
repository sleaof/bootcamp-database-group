package com.apliccation.studentsorted.repositories;

import com.apliccation.studentsorted.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(nativeQuery = true, value ="SELECT * FROM student " +
                                        "ORDER BY RAND () LIMIT 10")
    List<Student> getRandomStudents();
}
