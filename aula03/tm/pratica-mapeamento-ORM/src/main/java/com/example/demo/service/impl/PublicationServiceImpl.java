package com.example.demo.service.impl;

import com.example.demo.dto.PublicationDTO;
import com.example.demo.entity.PublicationEntity;
import com.example.demo.repository.*;
import com.example.demo.service.PublicationService;
import org.springframework.stereotype.Service;

@Service
public class PublicationServiceImpl implements PublicationService {

    private final PublicationRepository publicationRepository;
    private final UserRepository userRepository;

    public PublicationServiceImpl(PublicationRepository publicationRepository, UserRepository userRepository) {
        this.publicationRepository = publicationRepository;
        this.userRepository = userRepository;
    }

    @Override
    public PublicationEntity addPublication(PublicationDTO publicationDTO) {
        PublicationEntity publicationEntity = new PublicationEntity();
        publicationEntity.setText(publicationDTO.getText());
        publicationEntity.setUserEntity(userRepository.findById(publicationDTO.getId_user()).orElseThrow());
        return publicationRepository.save(publicationEntity);
    }

    @Override
    public PublicationEntity getPublication(long publicationId) {
        return findById(publicationId);
    }

    @Override
    public PublicationEntity updatePublication(long publicationId, PublicationEntity publicationEntity) {
        PublicationEntity publicationUpdate = getPublication(publicationId);
        publicationUpdate.setText(publicationEntity.getText());
        return publicationUpdate;
    }

    @Override
    public void removePublication(long publicationId) {
        PublicationEntity publicationEntity = findById(publicationId);
        publicationRepository.delete(publicationEntity);
    }

    @Override
    public PublicationEntity findById(long publicationId) {
        return publicationRepository.findById(publicationId).orElseThrow();
    }
}
