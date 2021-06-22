package com.example.demo.services.impl;

import com.example.demo.entities.StudentEntity;
import com.example.demo.repositories.StudentRepository;
import com.example.demo.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentEntity getStudent(Long studentId) {
        return studentRepository.findByStudentId(studentId);
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAllStudents();
    }

    @Override
    public StudentEntity addStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public StudentEntity updateStudent(Long studentId, StudentEntity studentEntity) {
        StudentEntity studentUpdate = getStudent(studentId);
        studentUpdate.setName(studentEntity.getName());
        return addStudent(studentUpdate);
    }

    @Override
    public void deleteStudent(Long studentId) {
        StudentEntity studentEntity = studentRepository.findById(studentId).orElseThrow();
        studentRepository.delete(studentEntity);
    }

}
