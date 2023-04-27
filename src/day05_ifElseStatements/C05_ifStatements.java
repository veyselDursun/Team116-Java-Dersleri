package day05_ifElseStatements;

import java.util.Scanner;

public class C05_ifStatements {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.


        Scanner scanner =new Scanner(System.in);

        System.out.println("Lutfen 1. kenar uzunlugu giriniz");

        double a = scanner.nextDouble();

        System.out.println("Lutfen 2. kenar uzunlugu giriniz");

        double b = scanner.nextDouble();

        System.out.println("Lutfen 3. kenar uzunlugu giriniz");

        double c = scanner.nextDouble();

        if (a==b && a==c) System.out.println("Eskenar ucgen");

        else {
            System.out.println("Eskenar ucgen degil");}

    }
}
