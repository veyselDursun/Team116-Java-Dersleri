package day09_stringManipulation_forLoop;

public class C11_ForLoopAsalSayi {
    public static void main(String[] args) {

        // verilen bir sayinin asal sayi olup olmadigini yazdirin

        int sayi = 25;
        boolean asalMi = true;

        for (int i = 2; i < sayi - 1; i++) {
            if (sayi % i == 0) {

                System.out.println("dene" + i);

                asalMi = false;
                break; // Bir Loop'un icerisinde Loop'un calismasini durdurmak icin break kullanabilirsin
            }
        }
            if (asalMi) {
                System.out.println("sayi asal");
            } else {
                System.out.println("sayi asal degil");
            }

    }
}