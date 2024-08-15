package cautrucrenhanh;

import java.util.Scanner;

public class bai_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Nhap so nguyen: ");
        a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.print("La so chan");
        } else {
            System.out.print("La so le");
        }
    }

}
