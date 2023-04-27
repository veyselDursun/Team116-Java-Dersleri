package aaTekrar;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif veya negatif bir tam sayi giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 != 0) {      //sayi tek
            if (sayi < 0) {
                // tek sayi sifirdan kucukse
                System.out.println("Girdiginiz sayi negatif bir tek sayidir");

            } else {
                System.out.println("Girdiginiz sayi Pozitif bir tek sayidir");

            }

        } else {              //sayi cift
            if (sayi%10==0){
                System.out.println("Girdiginiz sayi 10'un tam katidir");{

                }

            }else {
                System.out.println("Girdiginiz sayi 10'un tam kati degildir");
            }
        }

    }
}