package com.example.demo.services.impl;

import com.example.demo.entities.StudentEntity;
import com.example.demo.repositories.StudentRepository;
import com.example.demo.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentEntity> randomSelectionOfStudent() {
        List<StudentEntity> students = studentRepository.findAll();
        Collections.shuffle(students);

        return students.subList(0, 10);
    }
}
