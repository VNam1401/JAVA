package Cautrucdieukhienlap;
public class bai_13 {
    public static void main(String[] args) {
         System.out.println("Cac so thoa man dieu kien:");
        for (int i = 10; i <= 99; i++) {
            int chuc = i / 10;
            int dvi = i % 10;
            if (chuc * dvi == 2 * (chuc + dvi)) {
                System.out.println(i);
            }
        }
    }
    
}
