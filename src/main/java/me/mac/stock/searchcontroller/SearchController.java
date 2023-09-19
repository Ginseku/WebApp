package me.mac.stock.searchcontroller;

import me.mac.stock.models.enums.Stock;
import me.mac.stock.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


public class SearchController {
//    @Autowired
//    StockService stockService;

//    @GetMapping("/search")
//    public String searchProduct(@RequestParam(required=false, name = "productName") String productName, Model model){
//        List<Stock> info = stockService.searchProd(productName);
//        model.addAttribute("info", info);
//        System.out.println(info);
//        return "redirect:/";
//    }
//    @GetMapping("/secondList/{id}")
//    public String showInfoProdById(@PathVariable("id") Long id, Model model){
//       Stock secondStoreg = stockService.findById(id);
//       model.addAttribute("secondStoreg", secondStoreg);
//        return "productInfo.ftlh";
//    }
}
