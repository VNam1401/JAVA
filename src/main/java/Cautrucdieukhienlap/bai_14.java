package Cautrucdieukhienlap;

import java.util.Scanner;

public class bai_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;
        while (true) {
            System.out.print("Nhap vao mot so(0 de ket thuc): ");
            double number = sc.nextDouble();
            if (number == 0) {
                break;
            }
            sum += number;
            count++;
        }

        if (count == 0) {
            System.out.println("Khong hop le.");
        } else {
            double tb = sum / count;
            System.out.printf("trung binh cac so vua nhap la: %.3f\n", tb);
        }
    }

}
