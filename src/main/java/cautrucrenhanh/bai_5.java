package cautrucrenhanh;

import java.util.Scanner;

public class bai_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km, thanhtien;
        System.out.print("Nhap so km: ");
        km = sc.nextDouble();
        if (km == 1) {
            System.out.println("15000$");
        } else if (km >= 2 && km <= 5) {
            thanhtien = km * 13500;
            System.out.print(thanhtien + "$");
        } else if (km >= 6) {
            thanhtien = km * 11000;
            System.out.print(thanhtien + "$");
        } else if (km >= 120) {
            thanhtien = km * 11000 * 0.1;
            System.out.print(thanhtien + "$");
        } else {
            System.out.println("Khong hop le ");
        }
    }

}
