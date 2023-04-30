package aaTekrar;

public class Varargsss {

    public static void main(String[] args) {


        islemYap(4,5);
        islemYap(4,5,6,7,8,9);
        islemYap(4,5,2,3,4,10,12);

    }

    public static void islemYap(int ilkSayi, int...geriyeKalanSayilar){

        int toplam =0;

        for (int each:geriyeKalanSayilar
             ) {
            toplam+=each;
        }

        System.out.println("Istenilen islem sonucu : " + (ilkSayi * ilkSayi * toplam));

    }
}
