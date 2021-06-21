package com.example.demo.service;


import com.example.demo.dto.PublicationDTO;
import com.example.demo.entity.PublicationEntity;

public interface PublicationService {

    public PublicationEntity addPublication(PublicationDTO publicationDTO);
    public PublicationEntity getPublication(long publicationId);
    public PublicationEntity updatePublication(long publicationId, PublicationEntity publicationEntity);
    public void removePublication(long publicationId);
    public PublicationEntity findById(long publicationId);
}
