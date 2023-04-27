package day07_switchStatements_StringManipulations;


import java.util.Scanner;

public class C01_SwitchStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");

        int ilkHarf = scanner.nextInt();


        switch (ilkHarf){

            case 'O' :
                System.out.println("Ocak");
            case 'S' :
                System.out.println("Subat");
            case 'M' :
                System.out.println("Mart veya Mayis");
            case 'N' :
                System.out.println("Nisan");
            case 'H' :
                System.out.println("Haziran");
            case 'T' :
                System.out.println("Temmuz");
            case 'A' :
                System.out.println("Agustos veya Aralik");
            case 'E' :
                System.out.println("Eylul veya Ekim");
            case 'K' :
                System.out.println("Kasim");

        }

    }

}
