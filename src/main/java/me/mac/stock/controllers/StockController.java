package me.mac.stock.controllers;


import lombok.RequiredArgsConstructor;
import me.mac.stock.models.enums.Stock;
import me.mac.stock.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
public class StockController {
    @Autowired
    StockService stockService;

    @GetMapping("/")
    public String showProd(@RequestParam(name = "productName", required = false) String productName, Model model) {
        model.addAttribute("products", stockService.searchProd(productName));
//        List<Stock> showList = stockService.prodList();
//        model.addAttribute("showList", showList);
//        model.addAttribute("showSize", showList.size());
        return "site2";
    }


    @GetMapping("/secondList/{id}")
    public String showInfoProdById(@PathVariable Long id, Model model) {
        Stock stock = stockService.findProdById(id);
        model.addAttribute("stock", stock);
        model.addAttribute("images", stock.getImagesList());
        return "productInfo";
    }

    @PostMapping("/add")
    public String addProduct(@RequestParam("file1") MultipartFile file1, @RequestParam("file2") MultipartFile file2,
                             @RequestParam("file3") MultipartFile file3, Stock stock) throws IOException {
        stockService.addProd(stock, file1, file2, file3);
        return "redirect:/";
    }

    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        stockService.deleteProd(id);
        return "redirect:/";
    }


}
