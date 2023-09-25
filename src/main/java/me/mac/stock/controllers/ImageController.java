package me.mac.stock.controllers;

import lombok.RequiredArgsConstructor;
import me.mac.stock.models.enums.Images;
import me.mac.stock.repositories.ImageRepository;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;

@RestController
@RequiredArgsConstructor
public class ImageController {
    private final ImageRepository imageRepository;

    @GetMapping("/images/{id}")
    private ResponseEntity<?> getImageById(@PathVariable Long id) {
        Images images = imageRepository.findById(id).orElse(null);
        return ResponseEntity.ok()
                .header("fileName", images.getOriginalFileName())
                .contentType(MediaType.valueOf(images.getContentType()))
                .contentLength(images.getSize())
                .body(new InputStreamResource(new ByteArrayInputStream(images.getBytes())));
    }

}
