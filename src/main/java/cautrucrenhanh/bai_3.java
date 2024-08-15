package cautrucrenhanh;

import java.util.Scanner;

public class bai_3 {

    public static void main(String[] args) {
        String kq = "";
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap A: ");
         a = sc.nextInt();
        System.out.print("Nhap B: ");
         b = sc.nextInt();
        System.out.print("Nhap C: ");
         c = sc.nextInt();
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("So nho nhat la: " + min);
    }

}
