package com.application.hqljpaexample.services;

import com.application.hqljpaexample.entities.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface StudentService {

    public List<Student> findAllUsers();

    public Student findUserById(Long id);

    public Student saveStudent(Student student);

    public void createUser(Student student);

    public void updateStudent(Long id, String password);

    public void deleteUserById(Long id);


}
