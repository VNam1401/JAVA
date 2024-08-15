package Cautrucdieukhienlap;

import java.util.Scanner;

public class bai_11 {

    public static void main(String[] args) {
        int n;
        int sodao;

        Scanner sc = new Scanner(System.in);
//b1. Đọc số nguyên n từ bàn phím
        System.out.print("Cho biet n:");
        n = sc.nextInt();
//b2. Gọi hàm tìm số đảo của n
        sodao = TimSoDao(n);
//b3.Ket luan : doi xung hay khong doi xung
        if (sodao == n) {
            System.out.println(n + " la doi xung");
        } else {
            System.out.println(n + " la so khong doi xung");
        }
    }
//Định nghĩa hàm tìm số đảo của 1 số nguyên

    private static int TimSoDao(int n) {
        int sodao = 0;
        while (n > 0) {
            sodao = sodao * 10 + n % 10;
            n = n / 10;
        }
        return sodao;
    }
}
