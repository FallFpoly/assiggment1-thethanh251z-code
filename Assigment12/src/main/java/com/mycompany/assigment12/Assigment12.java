/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.assigment12;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class Assigment12 {
 
    protected String maNV;
    protected String hoTen;
    protected double luong;

    public Assigment12() {}

    public Assigment12(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getThuNhap() {
        return luong;
    }

    public double getThueThuNhap() {
        double tn = getThuNhap();
        if (tn < 9000000) return 0;
        else if (tn <= 15000000) return (tn - 9000000) * 0.1;
        else return (tn - 15000000) * 0.12 + 600000;
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap ma NV: ");
        maNV = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap luong: ");
        luong = Double.parseDouble(sc.nextLine());
    }

    public void xuat() {
        System.out.printf("Ma NV: %-10s | Ho ten: %-20s | Luong: %10.2f | Thu nhap: %10.2f | Thue: %10.2f\n",
                maNV, hoTen, luong, getThuNhap(), getThueThuNhap());
    }
}