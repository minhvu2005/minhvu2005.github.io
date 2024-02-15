
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class NhanVien {
    String ma,hoTen,loai;
    double  luong;

    public NhanVien() {
    }

    public NhanVien(String ma, String hoTen,String loai, double luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.luong = luong;
        this.loai = loai;
    }
    public void nhap(Scanner s){
        System.out.print("ma:");
        this.ma = s.nextLine();
        System.out.println("ho ten:");
        this.hoTen =s.nextLine();
        System.out.println("luong:");
        this.luong=s.nextDouble();
        s.nextLine();
    }
    public void xuat(){
        System.out.printf("ma:%s-hoten:%s-loai:%s-loai:%S-luong:%s",
            ma,hoTen,loai,luong);
    }
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
}
