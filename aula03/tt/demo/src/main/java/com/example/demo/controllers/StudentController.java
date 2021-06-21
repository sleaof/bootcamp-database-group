package com.example.demo.controllers;

import com.example.demo.entities.StudentEntity;
import com.example.demo.services.impl.StudentServiceImpl;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@RestController
public class StudentController {

    private final StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/sorteioaluno")
    public ResponseEntity<List<StudentEntity>> randomStudent(){
        return new ResponseEntity<>(studentService.randomSelectionOfStudent(),HttpStatus.OK);
    }
}
