package day12_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {

    // kullanicidan sayi degerleri alip toplayalim
    // kullanici 0'a bastiginda islem bitsin
    // ve toplami yazdirsin

    public static void main(String[] args) {

        /*
            Do while loop kontrol etmeden once
            1 kere loop'u calistirir
            while loop'da loop body'sinin hic calismama ihtimali VARDIR
            do-while loop'da loop body'sinin hic calismama ihtimali YOKTUR
            loop body'si en az bir kere calisir
         */

        Scanner scanner= new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        do {
            System.out.println("Lutfen toplamak icin bir sayi yazin \nBitirmek icin 0'a basin");
            sayi= scanner.nextInt();
            toplam+=sayi;
        }while (sayi != 0);




    }
}
