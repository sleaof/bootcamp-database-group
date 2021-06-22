package com.example.demo.controllers;

import com.example.demo.entities.StudentEntity;
import com.example.demo.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<StudentEntity> getStudent(@PathVariable Long studentId) {
        return new ResponseEntity<>(studentService.getStudent(studentId), HttpStatus.OK);
    }

    @GetMapping("/getAllStudents")
    public ResponseEntity<List<StudentEntity>> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<StudentEntity> addStudent(@RequestBody StudentEntity studentEntity) {
        return new ResponseEntity<>(studentService.addStudent(studentEntity), HttpStatus.OK);
    }

    @PutMapping("/{studentId}")
    public ResponseEntity<StudentEntity> updateStudent(@PathVariable Long studentId, @RequestBody StudentEntity studentEntity) {
        return new ResponseEntity<>(studentService.updateStudent(studentId, studentEntity), HttpStatus.OK);
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<?> deleteStudent(@PathVariable Long studentId) {
        studentService.deleteStudent(studentId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
