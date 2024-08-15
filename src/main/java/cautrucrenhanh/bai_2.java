package cautrucrenhanh;

import java.util.Scanner;

public class bai_2 {

    public static void main(String[] args) {
        String xeploai;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm môn Toán: ");
        double toan = sc.nextDouble();
        System.out.print("Nhập điểm môn Văn: ");
        double van = sc.nextDouble();
        System.out.print("Nhập điểm môn Anh: ");
        double anh = sc.nextDouble();
        double dtb = (toan + van + anh) / 3;
        if (dtb >= 0 && dtb < 4.0) {
            xeploai = "Yếu";
        } else if (dtb >= 4.0 && dtb < 6.5) {
            xeploai = "Trung bình";
        } else if (dtb >= 6.5 && dtb < 8.0) {
            xeploai = "Khá";
        } else if (dtb >= 8.0 && dtb <= 10) {
            xeploai = "Giỏi";
        } else {
            xeploai = "Điểm không hợp lệ";
        }
        System.out.println("Điểm trung bình: " + dtb);
        System.out.println("Xếp loại: " + xeploai);
    }

}
