
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class DanhSachNhanVien {
    private ArrayList<NhanVien> list = new ArrayList<>();
    
    public void Nhap(){
        Scanner s = new Scanner(System.in);
        list.clear();
        do{
            System.out.println("nhap loai nhan vien(nhap rong de thoai, 1.Hanh Chinh,2.Truong Phong,3.Tiep Thi):"); 
            String loai =s.nextLine();
         if (loai == null || loai.equals(""))
             break;
         
         int iloai = Integer.parseInt(loai);
         switch (iloai){
             case 1:
             NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
             nvhc.nhap(s);
             list.add(nvhc);
             break;
             case 2:
                 TruongPhong tp = new TruongPhong();
                 tp.nhap(s);
                 list.add(tp);
                 break;
             case 3:
                 NhanVienTiepThi nvtt = new NhanVienTiepThi();
                 nvtt.nhap(s);
                 list.add(nvtt);
                 break;
         }
         
        }while(true);
    }
    public void Xuat(){
        System.out.println("danh sach nhan vien:");
        for (NhanVien nv:list){
            if (nv instanceof NhanVienHanhChinh){
                ((NhanVienHanhChinh)nv).xuat();
            }else if (nv instanceof NhanVienTiepThi){
                ((NhanVienTiepThi)nv).xuat();
            }else if (nv instanceof TruongPhong){
                ((TruongPhong)nv).xuat();
            }
            System.out.println("\n------------------");
        }
    }
    
}
