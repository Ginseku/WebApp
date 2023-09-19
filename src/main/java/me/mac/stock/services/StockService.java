package me.mac.stock.services;

import me.mac.stock.models.enums.Images;
import me.mac.stock.models.enums.Stock;
import me.mac.stock.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@Service
public class StockService {
    @Autowired
    StockRepository stockRepository;

    public StockService() {
    }

    public List<Stock> prodList() {
        return stockRepository.findAll();
    }

    public Stock addProd(Stock stock, MultipartFile file1, MultipartFile file2, MultipartFile file3) throws IOException {
        Images image1;
        Images image2;
        Images image3;

        if(file1.getSize() != 0){
            image1 = toImageEntity(file1);
            image1.setPreviewImage(true);
            stock.addImageToProduct(image1);
        }
        if(file2.getSize() != 0){
            image2 = toImageEntity(file2);
            stock.addImageToProduct(image2);
        }
        if(file3.getSize() != 0){
            image3 = toImageEntity(file3);
            stock.addImageToProduct(image3);
        }

        return stockRepository.save(stock);
    }

    private Images toImageEntity(MultipartFile file) throws IOException {
        Images images = new Images();
        images.setName(file.getName());
        images.setOriginalFileName(file.getOriginalFilename());
        images.setContentType(file.getContentType());
        images.setSize(file.getSize());
        images.setBytes(file.getBytes());
        return images;
    }

    public void deleteProd(Long id) {
        stockRepository.deleteById(id);
    }

    public Stock findProdById(Long id){
        return stockRepository.findById(id).orElse(null);
    }

//    public List<Stock> searchProd(String productName) {
//        if (productName != null){
//            return stockRepository.findByProductNameContainingIgnoreCase(productName);
//        }
//        return stockRepository.findAll();
//    }


}

