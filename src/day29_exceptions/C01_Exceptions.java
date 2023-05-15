package day29_exceptions;

import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) {

        // Kullanicidan iki tam sayi alip ilk sayiyi ikinci
        // sayiya bolunuz ve sonucun tam sayi kismini yazdirin

        Scanner scan = new Scanner (System.in);

        System.out.println("Lütfen bolunecek tam sayiyi yazin : ");
        int sayi1 = scan.nextInt();

        System.out.println("Lütfen bolecek tam sayiyi yazin : ");
        int sayi2 = scan.nextInt();


        if( sayi2 == 0) {
            System.out.println("!!!Sayilar sifira bölünemez!!!");

        } else {
            System.out.println("Ik sayinin bolme sonucu : " + sayi1 / sayi2);

        }

    }
}
