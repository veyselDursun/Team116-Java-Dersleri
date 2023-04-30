package aaTekrar;

public class Varargss {
    public static void main(String[] args) {

        topla (23,34);

        topla (12,34,56);

        topla (23,45,67,89);

        topla (34,67,89,76,54,32,12,88);

    }

    public static void topla(int...sayilar){

        int toplam = 0;

        for (int each:sayilar) toplam +=each;

        System.out.println("Verilen " + sayilar.length + " elementin toplami : " + toplam);

    }

}
