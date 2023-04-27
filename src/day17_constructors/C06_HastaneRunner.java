package day17_constructors;

public class C06_HastaneRunner {

    public static void main(String[] args) {


        C05_Hastane per1 = new C05_Hastane();
                                                //parametresiz kod calisti

        System.out.println(per1.personelIsmi); //Isim belirtilmedi
        System.out.println(per1.personelTelefon);//Telefon belirtilmedi
        System.out.println(per1.personelAdresi);//Adres belirtilmedi
        System.out.println(per1.personelTuru);//Personel turu belirtilmedi
        System.out.println(per1.maas()); //1900

        per1.personelIsmi="Adem";
        per1.personelAdresi ="Cankaya";
        per1.personelTelefon ="553456789";
        per1.personelTuru ="Doktor";

        System.out.println(per1.personelIsmi); //Adem
        System.out.println(per1.personelTelefon);//Cankaya
        System.out.println(per1.personelAdresi); // 553456789
        System.out.println(per1.personelTuru);//Doktor
        System.out.println(per1.maas()); //5000


    }
}
