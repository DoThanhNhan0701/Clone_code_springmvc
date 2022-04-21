/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cnpm.pojos;

import javax.persistence.*;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name="hoadon")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDHoaDon")
    private int idHoaDon;
    @JoinColumn (name="IDKhachHang")
    @ManyToOne
    private Account idKhachHang;
    @JoinColumn(name="IDMatHang")
    @ManyToOne
    private MatHang idMatHang;
    @Column(name="TenKhachHang")
    private String tenKhachHang;
    @Column(name="SoLuong")
    private int soLuong;
    @Column(name="SoDienThoai")
    private String sdt;
    @Column(name="DiaChiGiao")
    private String diaChiGiao;
    @Column(name="TongTien")
    private int tongTien;
    @Column(name="TinhTrang")
    private int tinhTrang;

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public MatHang getIdMatHang() {
        return idMatHang;
    }

    public void setIdMatHang(MatHang idMatHang) {
        this.idMatHang = idMatHang;
    }

    public Account getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(Account idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChiGiao() {
        return diaChiGiao;
    }

    public void setDiaChiGiao(String diaChiGiao) {
        this.diaChiGiao = diaChiGiao;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public HoaDon() {
    }

    public HoaDon(Account idKhachHang, MatHang idMatHang, String tenKhachHang, int soLuong, String sdt, String diaChiGiao, int tongTien, int tinhTrang) {
        this.idKhachHang = idKhachHang;
        this.idMatHang = idMatHang;
        this.tenKhachHang = tenKhachHang;
        this.soLuong = soLuong;
        this.sdt = sdt;
        this.diaChiGiao = diaChiGiao;
        this.tongTien = tongTien;
        this.tinhTrang = tinhTrang;
    }
}
