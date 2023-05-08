package aaTekrar;

import java.util.Scanner;

public class GeometrikSekiller {

    public class Diktdortgen {
        Scanner scan=new Scanner(System.in);


        public void main(String[] args) {



        }

        void cevre(){
            System.out.print("Kısa kenar uzunluğunu giriniz: ");
            int kKenar=scan.nextInt();
            System.out.print("Uzun kenar uzunluğunu giriniz: ");
            int uKenar=scan.nextInt();
            System.out.println("Dikdörtgenin çevresi: "+2*(kKenar+uKenar));
        }

        void alan(){
            System.out.print("Kısa kenar uzunluğunu giriniz: ");
            int kKenar=scan.nextInt();
            System.out.print("Uzun kenar uzunluğunu giriniz: ");
            int uKenar=scan.nextInt();
            System.out.println("Dikdörtgenin alanı: "+(kKenar*uKenar));
        }
    }
}
