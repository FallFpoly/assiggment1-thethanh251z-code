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
public class Truongphong extends Assigment12{

    private double luongTrachNhiem;

    public Truongphong() {}

    public Truongphong(String maNV, String hoTen, double luong, double luongTrachNhiem) {
        super(maNV, hoTen, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap luong trach nhiem: ");
        luongTrachNhiem = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double getThuNhap() {
        return luong + luongTrachNhiem;
    }
}
