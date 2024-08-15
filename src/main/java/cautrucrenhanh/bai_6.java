package cautrucrenhanh;

import java.util.Scanner;

public class bai_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("Nhap so nguyen A: ");
        a = sc.nextDouble();
        System.out.print("Nhap so nguyen B: ");
        b = sc.nextDouble();
        System.out.print("Nhap vao phep toan (+, -, *, /): ");
        char pt = sc.next().charAt(0);//gán giá trị//
        switch (pt) {
            case '+':
                System.out.println("ket qua: " + (a + b));
                break;
            case '-':
                System.out.println("ket qua: " + (a - b));
                break;
            case '*':
                System.out.println("ket qua: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("ket qua: " + (a / b));
                } else {
                    System.out.println("khong chia cho 0!!");
                }
                break;
            default:
                System.out.println("khong hop le!");
        }

    }

}
