package com.apliccation.studentsorted.services;

import com.apliccation.studentsorted.dtos.StudentDTO;
import com.apliccation.studentsorted.entities.Student;
import com.apliccation.studentsorted.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentImplService implements StudentService {

    private final StudentRepository studentRepository;

    public StudentImplService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<StudentDTO> sortedTenStudents() {
        List<StudentDTO> studentsSorted = new ArrayList<>();
        for(Student s : studentRepository.getRandomStudents()){
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setId(s.getId());
            studentDTO.setName(s.getName());
            studentsSorted.add(studentDTO);
        }
        return studentsSorted;
    }
}
