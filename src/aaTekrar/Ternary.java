package aaTekrar;

import java.util.Scanner;

public class Ternary {
    // yas 18'den kucukse cocuk, degilse yetiskin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yasinizi giriniz: ");
        int yas = scanner.nextInt();

        String durum = yas>18 ? "Yetiskin" : "Cocuk";

        System.out.println("Cocugunuz: " + durum +"'dir");

    }
}
