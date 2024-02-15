package app;

import java.util.Scanner;

import service.XeMayService;

public class QuanLyXeMay {
    
    public static void main(String[] args) {
        XeMayService xmsv = new XeMayService();
        do {
            Scanner sc = new Scanner(System.in);
            int chon;
            System.out.println("1.Them danh sach:");
            System.out.println("2.In danh sach:");
            System.out.println("3.Xoa theo ma:");
            System.out.println("4.Cap nhat theo ma:");
            System.out.println("5.Xap xep theo nam san xuat:");
            System.out.println("6.Thoat menu.");
            System.out.println("Moi ban chon mot chuc nang:");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    xmsv.nhap();
            
                    break;

                case 2:
                    xmsv.xuat();
                    break;
                case 3:
                    System.out.println("nhập vào mã mà bạn muốn xóa:");
                    String ma=sc.nextLine();
                    xmsv.xoabanghitheoma(ma);
                    break;
                case 4:
                    System.out.println("nhập vào mã mà bạn muốn sửa:");
                    String maxe =sc.nextLine();
                    xmsv.sua(maxe);
                    break;
                case 5:
                    xmsv.xapxep();
                    System.out.println("ban da xap xep xong");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println(" moi ban chon lai chuc nang:");
            }
        } while (true);
    }
    
}
