package aaTekrar;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Toplanacak sayilari giriniz: ");


        int toplam = 0;

        while (toplam < 100){

            int sayi = scanner.nextInt();
            toplam += sayi;
        }

        System.out.println("Sayilarin toplami: " + toplam);
    }
}
