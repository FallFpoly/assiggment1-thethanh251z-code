/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assigment12;
 import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Tiepthi extends Assigment12 {

    private double doanhSo;
    private double hueHong;

    public Tiepthi() {}

    public Tiepthi(String maNV, String hoTen, double luong, double doanhSo, double hueHong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap doanh so: ");
        doanhSo = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap ti le hue hong (%): ");
        hueHong = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double getThuNhap() {
        return luong + doanhSo * hueHong / 100;
    }
}
