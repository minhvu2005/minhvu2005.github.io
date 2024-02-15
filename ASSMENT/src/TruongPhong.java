
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class TruongPhong extends NhanVien{
    private double luongTrachNhiem;

    public TruongPhong() {
    }
    
    public TruongPhong(String ma, String hoTen, double luong,double luongTrachNhiem) {
        super(ma, hoTen,"Truong Phong", luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }
    public void nhap(Scanner s){
        super.nhap(s);
        System.out.println("luong trach nhiem");
        luongTrachNhiem = s.nextDouble();
        
    }
    public void xuat(){
        super.xuat();
        System.out.printf("luong trach nhiem:%f",luongTrachNhiem);
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }
    
}
