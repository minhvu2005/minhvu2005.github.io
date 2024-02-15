package model;

import java.util.Scanner;

public class XeMay {

    private String ma;
    private String ten;
    private String hangxanxuat;
    private int nam;
    private Double gia;

    public XeMay() {
    }

    public XeMay(String ma, String ten, String hangxanxuat, int nam, Double gia) {
        this.ma = ma;
        this.ten = ten;
        this.hangxanxuat = hangxanxuat;
        this.nam = nam;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHangxanxuat() {
        return hangxanxuat;
    }

    public void setHangxanxuat(String hangxanxuat) {
        this.hangxanxuat = hangxanxuat;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập vào mã xe máy:");
        ma = sc.nextLine();
        System.out.println("mời bạn nhập vào tên xe máy:");
        ten = sc.nextLine();
        System.out.println("mời bạn nhập vào hãng sản xuất:");
        hangxanxuat = sc.nextLine();
        System.out.println("mời bạn nhập vao năm sản xuất:");
        nam = sc.nextInt();
        System.out.println("mời bạn nhập vào giá:");
        gia = sc.nextDouble();
    }

    public void xuat() {
        System.out.println("mã xe máy là:" + ma);
        System.out.println("tên xe máy là:" + ten);
        System.out.println("hãng xe máy là:" +hangxanxuat );
        System.out.println("giá xe máy là:" + gia);
        System.out.println("năm sản xuất la:"+nam);
        System.out.println("======================");

    }
}
