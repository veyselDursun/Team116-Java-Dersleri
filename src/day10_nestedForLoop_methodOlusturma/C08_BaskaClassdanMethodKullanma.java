package day10_nestedForLoop_methodOlusturma;

public class C08_BaskaClassdanMethodKullanma {
    public static void main(String[] args) {

        /*
            Java OOP consept'in en buyuk avantaji
            proje icerisinde 1 kere olusturulan method'un
            her yerden rahatlikla kullanilabilmesidir

            Baska bir class'da static keyword kullanilarak olusturulan method'lara
            classIsmi.methodismi(parametreler) seklinde ulasabiliriz
         */
        C07_MethodOlusturma.ikiSayiTopla(4,3);

        System.out.println("******************");
        C09_FaktoryelDegeriYazdirma.faktoryelDegeriYazdir(5);

        System.out.println("******************");
        C10_AsalSayiSonucuYazdirma.asalSayiMiYazdir(57);

        System.out.println("******************");
        System.out.println(C11_MiniHesapMakinasi.miniHesapMakinesi(5, 4, '*'));

        System.out.println("******************");
        System.out.println(C12_FaktoryelSonucuDondurme.faktoryelDegeriDondur(12));

        System.out.println("******************");
        System.out.println(C13_AsalSayiMiDondurme.asalSayiMi(78));
    }

}
