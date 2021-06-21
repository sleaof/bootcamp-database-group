package com.example.demo.controller;

import com.example.demo.dto.PublicationDTO;
import com.example.demo.entity.PublicationEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.impl.PublicationServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publication")
public class PublicationController {

    private final PublicationServiceImpl publicationService;

    public PublicationController(PublicationServiceImpl publicationService) {
        this.publicationService = publicationService;
    }

    @PostMapping
    public ResponseEntity<PublicationEntity> addPublication(@RequestBody PublicationDTO publicationDTO) {
        PublicationEntity newPublication = publicationService.addPublication(publicationDTO);
        return new ResponseEntity<>(newPublication, HttpStatus.CREATED);
    }

    @GetMapping("/getPublication/{publicationId}")
    public ResponseEntity<PublicationEntity> getPublication(@PathVariable Integer publicationId) {
        return new ResponseEntity<>(publicationService.getPublication(publicationId), HttpStatus.OK);
    }

    @PostMapping("/updatePublication/{publicationId}")
    public ResponseEntity<PublicationEntity> updatePublication(@PathVariable Integer publicationId, @RequestBody PublicationEntity publicationEntity) {
        return new ResponseEntity<>(publicationService.updatePublication(publicationId, publicationEntity), HttpStatus.OK);
    }

    @GetMapping("/deletePublication/{publicationId}")
    public ResponseEntity<?> removePublication(@PathVariable Integer publicationId) {
        publicationService.removePublication(publicationId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
