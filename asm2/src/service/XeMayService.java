package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.XeMay;

public class XeMayService {

    Scanner sc = new Scanner(System.in);
    private ArrayList<XeMay> ListXeMay = new ArrayList<>();
    private XeMay xeMay = new XeMay();

    public void nhap() {
        String check = null;

        do {

            Scanner sc = new Scanner(System.in);
            XeMay xeMay = new XeMay();
            xeMay.nhap();
            if (timkiem(xeMay.getMa()) != null) {
                System.out.println("Xe máy với mã " + xeMay.getMa() + " đã tồn tại. Vui lòng nhập mã khác.");
                continue;
            }

            ListXeMay.add(xeMay);
            System.out.println("ban co muon nhap tiep khong chon ?,y/n;");
            check = sc.nextLine();
        } while (check.equalsIgnoreCase("y"));

    }

    public void xuat() {
        for (XeMay xeMay1 : ListXeMay) {
            xeMay1.xuat();
        }
    }

    public void xapxep() {
        ListXeMay.sort((o2, o1) -> {
            return Double.compare(o1.getNam(), o2.getNam());
        });
    }

    public XeMay timkiem(String ma) {
        for (XeMay xeMay1 : ListXeMay) {
            if (xeMay1.getMa().equalsIgnoreCase(ma)) {
                return xeMay1;
            }
        }
        return null;
    }

    public void xoabanghitheoma(String ma) {
        XeMay xm = timkiem(ma);
        if (xeMay != null) {
            ListXeMay.remove(xm);
            System.out.println("xoa thanh cong:");
        } else {
            System.out.println("xoa khog thanh cong:");
        }
    }

    public void sua(String ma) {
        if (timkiem(ma) != null) {
            XeMay xeMay = timkiem(ma);
            System.out.println("xe may co ma la" + ma);
            System.out.println("nhap vao gia:");
            Double gia = sc.nextDouble();
            xeMay.setGia(gia);
        } else {
            System.out.println(" khong tim thay xe may co ma:" + ma);
        }
    }

}
