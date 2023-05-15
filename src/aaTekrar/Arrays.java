package aaTekrar;

public class Arrays {

    public static void main(String[] args) {

        int sayi [] = {5,6,7,8,9};

        System.out.println(sayi);

        System.out.println(java.util.Arrays.toString(sayi));

        System.out.println(sayi[2]);

        System.out.println(sayi[1]);

        String str = "Java cok guzel";

        String [] kelimeler = str.split(" ");
        System.out.println(java.util.Arrays.toString(kelimeler));

        String [] kelimeler2 = str.split("a");
        System.out.println(java.util.Arrays.toString(kelimeler2));

        String[] kelimeler3 = str.split("cok");
        System.out.println(java.util.Arrays.toString(kelimeler3));

        String[] kelimeler4 = str.split("");
        System.out.println(java.util.Arrays.toString(kelimeler4));
    }


}
