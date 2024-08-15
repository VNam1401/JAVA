package cautrucrenhanh;

import java.util.Scanner;

public class bai_1 {

    public static void main(String[] args) {
        double a, b;
        String kq = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("GIAI PT BAC NHAT: ");
        System.out.print("Nhap so A: ");
        a = sc.nextDouble();
        System.out.print("Nhap so B: ");
        b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                kq = "Phuong trinh vo so  nghiem";

            } else {
                kq = "Phuong trinh vo nghiem";
            }

        } else {
            kq = "Phuong trinh co nghiem duy nhat: " + -b / a;
        }
        System.out.println(kq);
    }
}
