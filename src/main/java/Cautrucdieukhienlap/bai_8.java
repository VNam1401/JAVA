package Cautrucdieukhienlap;

import java.util.Scanner;

public class bai_8 {

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so N: ");
        N = sc.nextInt();
        int tong = 0;
        for (int i = 1; i <= N; i++) {
            tong += i;
        }
        System.out.println("Tong cac so nguyen tu 1 -> " + N + " la: " + tong);
    }

}
