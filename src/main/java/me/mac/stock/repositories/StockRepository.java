package me.mac.stock.repositories;

import me.mac.stock.models.enums.Stock;
import me.mac.stock.services.StockService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
//    List<Stock> findByproductName(String productName);


//    List<Stock> findByproductNameStartingWith(String productName);
//    List<Stock> findByproductNameEndingWith(String productName);
//    List<Stock> findByproductNameContaining(String productName);
//    List<Stock> findByProductNameContainingIgnoreCase(String productName);
}
