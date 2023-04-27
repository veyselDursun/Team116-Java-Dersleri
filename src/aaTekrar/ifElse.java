package aaTekrar;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        /* 1.Soru: Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 1.notu giriniz: ");
        int not1 = scanner.nextInt();

        System.out.println("Lütfen 2.notu giriniz: ");
        int not2 = scanner.nextInt();

        if ((not1 + not2) / 2 >= 50) {
            System.out.println("TEBRIKLER GECTINIZ:)");

        } else {

            System.out.println("MALESEF KALDINIZ:(");

        }

        System.out.println("****************************");

        */

        /* 2.Soru: Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz:");
        double not = scanner.nextDouble();
        if (not < 0 || not > 100) {
            System.out.println("Gecersiz Not Girdiniz");
        } else if (not >= 85) {
            System.out.println("AA");

        } else if (not >= 85) {
            System.out.println("AA");
        } else if (not >= 70) {
            System.out.println("BB");
        } else if (not >= 55) {
            System.out.println("CC");
        } else if (not >= 40) {
            System.out.println("DD");
        } else{
            System.out.println("KALDINIZ");
        }

         */

        /* 3.Soru: Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz: ");
        char karakter = scanner.next().charAt(0);

        if (karakter >= 'a' && karakter <= 'z' || karakter >= 'A' && karakter <= 'Z') {
            System.out.println("Harf girdiniz");
        } else if (karakter>='0' && karakter<='9'){
            System.out.println("Sayi girdiniz");
        }else {
            System.out.println("ozel karakter girdiniz");
        }

         */

       /* 4.Soru: Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen notunu giriniz");
        int not=scanner.nextInt();

        System.out.println(not >= 50 ? "Tebrikler gectiniz" : "Malesef Kaldiniz");

        */

        /* 5.Soru: Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen haftanin günlerini sayi olarak giriniz");
        int gun = scanner.nextInt();

        if (gun>=8 || gun<1){
            System.out.println("Gecersiz giris yaptiniz");
        } else if (gun==1) {
            System.out.println("Pazartesi");
        }else if (gun==2) {
            System.out.println("Sali");
        } else if (gun==3) {
            System.out.println("Carsamba");
        }else if (gun==4) {
            System.out.println("Persembe");
        }else if (gun==5) {
            System.out.println("Cuma");
        }else if (gun==6) {
            System.out.println("Cumartesi");
        }else if (gun==7) {
            System.out.println("Pazar");
        }

         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen haftanin günlerini sayi olarak giriniz");
        int gun = scanner.nextInt();

        if (gun>=8 || gun<1) System.out.println("Gecersiz giris yaptiniz");
        if (gun==1) System.out.println("Pazartesi");
        if (gun==2) System.out.println("Sali");
        if (gun==3) System.out.println("Carsamba");
        if (gun==4) System.out.println("Persembe");
        if (gun==5) System.out.println("Cuma");
        if (gun==6) System.out.println("Cumartesi");
        if (gun==7) System.out.println("Pazar");


    }
}
