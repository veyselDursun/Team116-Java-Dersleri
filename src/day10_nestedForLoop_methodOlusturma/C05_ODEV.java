package day10_nestedForLoop_methodOlusturma;

public class C05_ODEV {
    public static void main(String[] args) {

        int sayi =5;
        for (int i = 1; i <= 5 ; i++) {

            for (int j = 1; j <= i ; j++) {

                System.out.print("*   ");

            }
            System.out.println("");
        }

        for (int k = 4; k >=1 ; k--) {

            for (int l = 1; l <= k ; l++) {

                System.out.print("*   ");
            }

            System.out.println("");
        }


    }
}
