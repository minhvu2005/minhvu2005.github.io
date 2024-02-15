
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class NhanVienTiepThi extends NhanVien{
     private double doanhSo;
     private double hoaHong;
     public void nhap(Scanner s){
         super.nhap(s);
         System.out.println("doanh so:");
         doanhSo =s.nextDouble();
         System.out.println("hoa hong");
         hoaHong =s.nextDouble();
         s.nextLine();
     }
     public void xuat(){
         super.xuat();
         System.out.printf("-doanhso:%f-hoahonh:%f",doanhSo,hoaHong);
     }
    public NhanVienTiepThi() {
    }

    public NhanVienTiepThi(String ma, String hoTen, String loai, double luong,double doanhSo, double hoaHong) {
        super(ma, hoTen, "Tiep Thi", luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

  
    
}
