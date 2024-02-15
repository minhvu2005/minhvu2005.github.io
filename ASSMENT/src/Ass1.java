import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class NhanVien {
    String ma;
    String hoTen;
    String loai;
    double luong;
    double tienHoaHong;
    double luongTrachNhiem;

    public NhanVien(String ma, String hoTen, String loai, double luong, double tienHoaHong, double luongTrachNhiem) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.loai = loai;
        this.luong = luong;
        this.tienHoaHong = tienHoaHong;
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public double tinhThuNhap() {
        if ("hanhchinh".equals(loai)) {
            return luong;
        } else if ("tiepthi".equals(loai)) {
            return luong + tienHoaHong;
        } else if ("truongphong".equals(loai)) {
            return luong + luongTrachNhiem;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Mã: " + ma + ", Họ tên: " + hoTen + ", Thu nhập: " + tinhThuNhap();
    }
}

public class Ass1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

        // Nhập thông tin nhân viên
        System.out.println("Nhập số lượng nhân viên: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1) + ":");
            System.out.print("Mã: ");
            String ma = scanner.nextLine();
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Loại (hanhchinh/tiepthi/truongphong): ");
            String loai = scanner.nextLine();
            System.out.print("Lương: ");
            double luong = scanner.nextDouble();

            double tienHoaHong = 0;
            double luongTrachNhiem = 0;

            if ("tiepthi".equals(loai)) {
                System.out.print("Tiền hoa hồng: ");
                tienHoaHong = scanner.nextDouble();
            } else if ("truongphong".equals(loai)) {
                System.out.print("Lương trách nhiệm: ");
                luongTrachNhiem = scanner.nextDouble();
            }

            NhanVien nhanVien = new NhanVien(ma, hoTen, loai, luong, tienHoaHong, luongTrachNhiem);
            danhSachNhanVien.add(nhanVien);
            scanner.nextLine();
            
        }

        
        danhSachNhanVien.sort(Comparator.comparingDouble(NhanVien::tinhThuNhap));

        System.out.println("Danh sách nhân viên sau khi sắp xếp:");

        for (NhanVien nhanVien : danhSachNhanVien) {
            System.out.println(nhanVien);
        }

        
        System.out.println("Nhập mã nhân viên cần tìm: ");
        String maCanTim = scanner.next();

        for (NhanVien nhanVien : danhSachNhanVien) {
            if (maCanTim.equals(nhanVien.ma)) {
                System.out.println("Thông tin nhân viên có mã " + maCanTim + ":");
                System.out.println("Họ tên: " + nhanVien.hoTen + ", Thu nhập: " + nhanVien.tinhThuNhap());
                break;
            }
        }

      
        System.out.println("Nhập khoảng thu nhập (từ đến): ");
        double tuThuNhap = scanner.nextDouble();
        double denThuNhap = scanner.nextDouble();

        System.out.println("Danh sách nhân viên trong khoảng thu nhập:");

        for (NhanVien nhanVien : danhSachNhanVien) {
            double thuNhap = nhanVien.tinhThuNhap();
            if (thuNhap >= tuThuNhap && thuNhap <= denThuNhap) {
                System.out.println(nhanVien);
            }
        }
    }
    
    
}
