package aaTekrar;

public class Varargs {
    public static void main(String[] args) {


        topla (23,34);

        topla (12,34,56);

        topla(23,45,67,89);


    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {

        System.out.println(sayi1 + sayi2 + sayi3 + sayi4 );
    }

    private static void topla(int sayi1, int sayi2) {

        System.out.println(sayi1+sayi2);
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {

        System.out.println(sayi1+sayi2);
    }






}
