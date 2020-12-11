package com.vesta.service.impl;

import com.vesta.exception.FileSizeException;
import com.vesta.repository.entity.AvatarEntity;
import com.vesta.service.AvatarService;
import com.vesta.service.converter.AvatarConverter;
import com.vesta.service.dto.AvatarDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Slf4j
@Service
@AllArgsConstructor
public class AvatarServiceImpl implements AvatarService {


    private final AvatarConverter converter;

    @Override
    public void uploadImage(Long userId, MultipartFile file) {
        log.info("method --- uploadImage");
        AvatarEntity entity;

//        verify(!userRepository.existsById(userId), () -> new NotFoundException("User not found"));

        try {
            entity = new AvatarEntity();
            entity.setName(file.getOriginalFilename());
//            entity.setUserEntity(userRepository.getOne(userId));
            entity.setAvatar(file.getBytes());
        } catch (IOException e) {
            throw new FileSizeException("File not correspond");
        }
//        repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        log.info("method --- delete");

//        repository.deleteById(id);
    }

    @Override
    public AvatarDto getByUserId(Long userId) {
        log.info("method --- getByID");

        return null;
    }

    @Override
    public ResponseEntity getAvatarByUserId(Long userId) {
        log.info("method --- getAvatarByUserId");

        return null;
    }
}