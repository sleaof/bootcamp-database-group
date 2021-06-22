package com.application.hqljpaexample.services;

import com.application.hqljpaexample.entities.Student;
import com.application.hqljpaexample.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> findAllUsers() {
        return studentRepository.findAllUsers();
    }

    @Override
    public Student findUserById(Long id) {
        return studentRepository.findUserById(id);
    }

    @Override
    public Student saveStudent(Student student) {
        Student saveStudent = student;
        studentRepository.save(saveStudent);
        return saveStudent;
    }

    @Override
    public void createUser(Student student) {
        studentRepository.createUser(student.getName(), student.getPassword());
    }



    @Override
    public void updateStudent(Long id, String password) {
        studentRepository.updateStudent(password, id);
    }

    @Override
    public void deleteUserById(Long id) {
        studentRepository.deleteUserById(id);
    }
}
