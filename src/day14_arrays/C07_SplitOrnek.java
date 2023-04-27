package day14_arrays;

import java.util.Arrays;

public class C07_SplitOrnek {

    public static void main(String[] args) {
        String str = "Java yilin bu zamanlarinda bir baska guzel oluyor Java olmadan java ogrenilmez";

        // Kac tane "java" var ?
        // 1) kelime kelime ayiriyoruz

        String[] arr =str.split(" "); // donen array kaydedilmeli
        System.out.println(Arrays.toString(arr)); // [Java, yilin, bu, zamanlarinda, bir, baska, guzel, oluyor, Java, olmadan, java, ogrenilmez]

        // loop ile arrayin bütün elemanlarına ulaşıp kontrol yaptık

        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equalsIgnoreCase("java")){

                // her java kelimesinde sayaci bir artırdık

                sayac++;
            }
        }
        System.out.println("java kelimesi sayac = " +sayac);
    }
}
