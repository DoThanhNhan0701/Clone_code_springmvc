package com.cnpm.repository;

import com.cnpm.pojos.HoaDon;

import java.util.List;

public interface HoaDonRepository {
    boolean add(HoaDon hoaDon);
    boolean delete(int idHoaDon);
    HoaDon getOne(int id);
    List<HoaDon> getList(String idKhachHang);
    boolean update(HoaDon hoaDon);

}
