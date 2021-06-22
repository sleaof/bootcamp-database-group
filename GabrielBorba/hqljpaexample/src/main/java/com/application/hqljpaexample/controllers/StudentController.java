package com.application.hqljpaexample.controllers;

import com.application.hqljpaexample.dtos.NewPasswordDTO;
import com.application.hqljpaexample.entities.Student;
import com.application.hqljpaexample.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> findAllUsers(){
        List<Student> listStudents = studentService.findAllUsers();
        return new ResponseEntity<>(listStudents, HttpStatus.OK);
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> findUserById(@PathVariable Long studentId){
        Student studentFind = studentService.findUserById(studentId);
        return new ResponseEntity<>(studentFind,HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createUser(@RequestBody Student student){
        studentService.createUser(student);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.OK)
    public Student save(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PutMapping
    public void updateStudent(@Valid @RequestBody NewPasswordDTO newPasswordDTO){
        studentService.updateStudent(newPasswordDTO.getId(), newPasswordDTO.getPassword());
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteUserById(@PathVariable Long id){
        studentService.deleteUserById(id);
    }


}
