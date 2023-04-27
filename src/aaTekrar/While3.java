package aaTekrar;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sayiyi giriniz ");

        int sayi= scanner.nextInt();
        int basamakSayisi =0;


        while(sayi!=0){

            basamakSayisi++;

            sayi/=10;

        }

        System.out.println("girilen sayinin basamak sayisi: " + basamakSayisi);
    }
}
