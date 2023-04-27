package day15_multiDimensionelArrays;

import java.util.ArrayList;
import java.util.List;

public class C10_set {

    // javada get() methodlari bize bilgi getirir
    // set () methodlari ise UPDATE yapar, var olan bir elementin degerini degistirir

    public static void main(String[] args) {

        int[] sayilar = {3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};

        List<Integer> sayiList = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            sayiList.add(sayilar[i]);

        }
        System.out.println(sayiList); // [3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]


        System.out.println(sayiList.set(0, 10)); //3

        System.out.println(sayiList); // [10, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]

        System.out.println(sayiList.set(2, 0)); //6

        System.out.println(sayiList); // [10, 5, 0, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]


    }


}
