package day16_arrayList;

import java.util.ArrayList;
import java.util.List;
public class C06_TamBolenler {

    // girilen bir pozitif sayinin tam bolenlerini liste olarak bize donduren bir method yaziniz

    public static void main(String[] args) {

        int sayi =10;
        System.out.println(  tamBolenlerListesi(sayi)   );
    }

    // method sayilardan olusan bir liste dondurecek
    // methodun icine bir sayi gonderebilmeliyiz

    public static List<Integer> tamBolenlerListesi (Integer sayi){
        List<Integer> tamBolenlerListesi= new ArrayList<>();
        for (int i = 1; i <=sayi ; i++) {

            // bir sayiyi looptan gelen i degerine boldugumuzde kalan sifir ise

            if (sayi % i == 0){
                tamBolenlerListesi.add(i); // 1 2 5 10
            }
        }
        return tamBolenlerListesi;
    }
}
