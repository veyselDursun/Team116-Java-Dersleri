package aaTekrar;

import java.util.Scanner;

public class TernaryDersNotu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz: ");
        int not = scanner.nextInt();

        System.out.println(not >= 50 ? "Tebrikler gectiniz:-)" : "Malesef kaldiniz:(");

    }
}
