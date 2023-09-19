package me.mac.stock.repositories;

import me.mac.stock.models.enums.Images;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Images,Long> {
}
