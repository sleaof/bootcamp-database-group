package com.apliccation.studentsorted.controllers;

import com.apliccation.studentsorted.dtos.StudentDTO;
import com.apliccation.studentsorted.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sorted")
public class StudentSortedController {

    @Autowired
    private StudentService studentService;


    @GetMapping
    public ResponseEntity<List<StudentDTO>> getStudentsSorted(){
        return new ResponseEntity<>(studentService.sortedTenStudents(), HttpStatus.OK);
    }

}
