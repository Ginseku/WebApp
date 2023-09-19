package me.mac.stock.models.enums;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @Column(name = "productName")
    public String productName;
    @Column(name = "category")
    public String category;
    @Column(name = "size")
    public float size;
    @Column(name = "color")
    public String color;
    @Column(name = "count")
    public int count;
    @Column(name = "price")
    public float price;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "stock")
    public List<Images> imagesList = new ArrayList<>();
    public Long previewImgId;
    public LocalDateTime dateOfCreate;

    @PrePersist
    public void init() {
        dateOfCreate = LocalDateTime.now();
    }


    public void addImageToProduct(Images images){
        images.setStock(this);
        imagesList.add(images);
    }


}