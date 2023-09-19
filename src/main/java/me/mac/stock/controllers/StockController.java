package me.mac.stock.controllers;


import lombok.RequiredArgsConstructor;
import me.mac.stock.models.enums.Stock;
import me.mac.stock.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StockController {
    @Autowired
    StockService stockService;

    @GetMapping("/")
    public String showProd(Model model) {
        List<Stock> showList = stockService.prodList();
        model.addAttribute("showList", showList);
        model.addAttribute("showSize", showList.size());
        return "site2";
    }


    @GetMapping("/secondList/{id}")
    public String showInfoProdById(@PathVariable Long id, Model model) {
        Stock stock = stockService.findProdById(id);
        model.addAttribute("stock", stock);
        return "productInfo";
    }

//    @PostMapping("/add")
//    public String addProduct(@ModelAttribute Stock stock) {
//        stockService.addProd(stock);
//        return "redirect:/";
//    }

    @RequestMapping("/delete/{id}")
    public String deletePoruct(@PathVariable Long id) {
        stockService.deleteProd(id);
        return "redirect:/";
    }


}
