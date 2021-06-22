package com.example.demo.repositories;

import com.example.demo.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    @Query("select s from StudentEntity s where s.id = :studentId")
    public StudentEntity findByStudentId(@Param("studentId") Long studentId);

    @Query("select s from StudentEntity s")
    public List<StudentEntity> findAllStudents();

}
