/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cnpm.controller;

import com.cnpm.pojos.LoaiSanPham;
import com.cnpm.pojos.MatHang;
import com.cnpm.pojos.NhomSanPham;
import com.cnpm.services.LoaiSanPhamService;
import com.cnpm.services.MatHangService;
import com.cnpm.services.NhomSanPhamService;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author ADMIN
 */
@Controller
@RequestMapping("/admin")
public class AdminControler {
    @Autowired
    private MatHangService matHangService;
    @Autowired
    private NhomSanPhamService nhomSanPhamService;
    @Autowired
    private LoaiSanPhamService loaiSanPhamService;
    
    @GetMapping("/themsanpham")
    public String addMatHang(Model model){
        model.addAttribute("mathang", new MatHang());
        List <LoaiSanPham> listLsp = this.loaiSanPhamService.getList();
        model.addAttribute("list", listLsp);
        return "themsanpham";
    }
    
    @PostMapping("/matHang/add")
    public String readdMatHang(@ModelAttribute(value="mathang") MatHang hang){
        hang.setLoaiSP(this.loaiSanPhamService.getOne(hang.getIdLoaiSanPham()));
        if(this.matHangService.add(hang)){
            return "redirect:/";
        }
        else{
            return "themsanpham";
        }
    }
    
    @GetMapping("/nhomsanpham")
    public String addNhomSanPham(Model model){
        model.addAttribute("nsp", new NhomSanPham());

        return "nhomsanpham";
    }

    @RequestMapping(path= "/nhomSanPham/add", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=utf-8")
    public String readdNhomSanPham(@ModelAttribute(value="nsp")NhomSanPham nsp){
        System.err.println();
        System.err.println(nsp.getTenNhomSP());
        if(this.nhomSanPhamService.add(nsp)){
            return "redirect:/";
        }
        else{
            return "addNhomSanPham";
        }
    }
    
    @GetMapping("/loaisanpham")
    public String addLoaiSanPham(Model model){
        List<NhomSanPham> listNSP = this.nhomSanPhamService.getNSP();
        model.addAttribute("lsp", new LoaiSanPham());
        model.addAttribute("listNSP", listNSP);
        return "loaisanpham";
    }
    
    @PostMapping("/loaiSanPham/add")
    public String readdLoaiSanPham(@ModelAttribute(value="lsp")LoaiSanPham lsp){
        NhomSanPham nhomSanPham = this.nhomSanPhamService.getNhomSanPham(lsp.getIdNhomsp());
        lsp.setNSP(nhomSanPham);
        System.err.println();
        System.err.println("===================== Fix bug Fix BUG ========================="+lsp.getTenLoaiSP());
        if(this.loaiSanPhamService.add(lsp)){
            return "redirect:/";
        }
        else{
            return "addLoaiSanPham";
        }
    }
 
    @RequestMapping("")
    public String admin(Model model, @RequestParam(required = false) Map<String, String> param){
        int page = Integer.parseInt(param.getOrDefault("page", "1"));
        int count = Integer.parseInt(param.getOrDefault("count", "20"));
        model.addAttribute("list", this.matHangService.getList(count, page));
        return "pageAdmin";
    }
    
    @RequestMapping("/sanpham")
    public String danhsachsanpham(Model model, @RequestParam(required = false) Map<String, String> param){
        int page = Integer.parseInt(param.getOrDefault("page", "1"));
        int count = Integer.parseInt(param.getOrDefault("count", "20"));
        model.addAttribute("list", this.matHangService.getList(count, page));
        return "sanpham";
    }
        @RequestMapping("/taikhoan")
    public String danhsachtaikhoan(Model model, @RequestParam(required = false) Map<String, String> param){
        int page = Integer.parseInt(param.getOrDefault("page", "1"));
        int count = Integer.parseInt(param.getOrDefault("count", "20"));
        model.addAttribute("taikhoan", this.matHangService.getList(count, page));
        return "taikhoan";
    }

}
