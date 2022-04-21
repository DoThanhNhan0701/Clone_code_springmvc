package com.cnpm.controller;

import com.cnpm.pojos.MatHang;
import com.cnpm.services.MatHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/admin/product")
public class ProductAdminController {
    @Autowired
    private MatHangService matHangService;

    @RequestMapping("")
    public String product(Model model, @RequestParam(required = true) Map<String,String> param){
        int page = Integer.parseInt(param.getOrDefault("page", "1"));
        int count = Integer.parseInt(param.getOrDefault("count", "10"));
        model.addAttribute("list", this.matHangService.getList(10,1,""));
        return "pageProduct";
    }

    @GetMapping("/update/{id}")
    public String updatemathang(Model model, @PathVariable int id){

        model.addAttribute("product", this.matHangService.getOne(id));
        model.addAttribute("id", id);
        return "updateProduct";
    }

    @PostMapping("/update/{id}")
    public String updateProduct(@ModelAttribute("product") MatHang matHang, @PathVariable int id){
        matHang.setIdMatHang(id);
        if(this.matHangService.updateProduct(matHang)){
            return "redirect:/admin";
        }
        else{
            return "redirect:/admin/product/add";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        this.matHangService.delete(id);
        return "redirect:/admin";
    }

}
