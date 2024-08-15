package Cautrucdieukhienlap;

import java.util.Scanner;

public class bai_12 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        // Nhập vào giá trị n
        System.out.print("Nhap so nguyen duong n (n > 0): ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("n la so nguyen duong (N<0) .");
        } else {
            int max = 0;
            int min = 9;
            while (n > 0) {
                int digit = n % 10;
                if (digit > max) {
                    max = digit;
                }
                if (digit < min) {
                    min = digit;
                }
                n = n / 10;
            }
            System.out.println("So lon nhat la: " + max);
            System.out.println("So nho nhat la: " + min);
        }
    }
    
}
