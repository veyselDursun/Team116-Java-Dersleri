package day12_doWhileLoop_scope;

public class Hastane {

    static String hastaneIsmi = "Yildiz hastanesi";
    static int personelSayisi;
    String personelIsmi;
    String personelAdresi;
    String personeltelefonu;

    /*
        Class level'da olusturulan variable'lar
        - eger tum nesneler icin ortak ise static olarak
        - her bir nesne icin farkli olacaksa instance olarak
        olusturulur.
        bu hastanede 500 personel varsa
        500 personel icin 500 isim, 500 adres, 500 telefon variable'i olmak zorundadir
        java bunu su sekilde cozmus :
        bu class'dan bir obje olusturuldugunda
        java tum instance variable'larin bir kopyasini olusturup
        o obje ile ilintilendirir
        Tum class level variable'lar icin
        deger atama mecburiyeti yoktur
        eger deger atanirsa o deger gecerlidir
        ancak deger atanmazsa java class level variable'lar icin
        default olarak belirledigi degerleri atama yapar
        sayisal variable : 0
        boolean : false
        char : hiclik
        non-primitive : null
     */

    public static void main(String[] args) {

        System.out.println(hastaneIsmi); // Yildiz Hastanesi

       // System.out.println(PersonelIsmi);
        System.out.println(personelSayisi); //0

        Hastane ayseHemsire = new Hastane();
        System.out.println(ayseHemsire.personelAdresi);
        ayseHemsire.personelAdresi = "Cankaya";
        ayseHemsire.personelIsmi = "Ayse";
        ayseHemsire.personeltelefonu = "3214556778";

        Hastane fatmaHemsire =new Hastane();
        fatmaHemsire.personelIsmi ="Fatma";
        fatmaHemsire.personelAdresi ="Yeni mahalle";
        fatmaHemsire.personeltelefonu ="555678945";

        System.out.println(ayseHemsire.personelIsmi); // Ayse
        System.out.println(fatmaHemsire.personelIsmi); // Fatma

        // static variable'lara direk erisim mumkundur
        System.out.println(hastaneIsmi); // Yildiz Hastanesi

        System.out.println(personelSayisi); // 0

        // obje uzerinden de static variable'lara ULASILABILIR
        // ancak intelliJ buna gerek yok diyerek bizi uyarir

        System.out.println(ayseHemsire.hastaneIsmi); // Yildiz Hastanesi yazar AMA

        // static olan hastane ismi variable'ina instance sekilde ulasildi diye uyari veriyor

        ayseHemsire.personelIsmi = "Levent Hastanesi";

        System.out.println(hastaneIsmi); // Levent Hastanesi
        System.out.println(fatmaHemsire.hastaneIsmi); // Levent Hastanesi yazar AMA

        // static olan hastane ismi variable'ina instance sekilde ulasildi diye uyari veriyor


    }

}
