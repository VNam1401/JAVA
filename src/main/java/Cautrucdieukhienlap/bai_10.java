package Cautrucdieukhienlap;

import java.util.Scanner;

public class bai_10 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Nhập vào giá trị n
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println(n + " khong phai so nguyen to.");
        } else if (snt(n)) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong phai so nguyen to.");
        }
    }
    public static boolean snt(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
