package com.example.demo.services;

import com.example.demo.entities.StudentEntity;

import java.util.List;

public interface StudentService {

    StudentEntity getStudent(Long studentId);
    List<StudentEntity> getAllStudents();
    void addStudent(StudentEntity studentEntity);
    void updateStudent(Long studentId, StudentEntity studentEntity);
    void deleteStudent(Long studentId);

}
