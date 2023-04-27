package day16_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_KullaniciListeOlusturma {

    //kullanicidan alinan isimleri listeye kaydeden bir method olusturun

    public static void main(String[] args) {

        System.out.println(kullanicidanStringAlarakListeOlusturma());

    }
    // method stringlerden olusan bir list dondurecek "List<String>"
    public static List<String> kullanicidanStringAlarakListeOlusturma(){

        Scanner scan = new Scanner(System.in);

        // loop sayisi bilinmiyorsa do_while veya while loop
        // kullanici isim yerine "0" girince program dursun

        String kullaniciGirdisi =" ";
        List<String> isimler =new ArrayList<>();

        // kullaniciGirdisi "0"a esit olmadigi surece loop devam etsin

        while (!kullaniciGirdisi.equalsIgnoreCase("0")){

            System.out.println("Lütfen listeye eklemek icin bir isim giriniz");
            kullaniciGirdisi = scan.next();


            if (!kullaniciGirdisi.equalsIgnoreCase("0")){ //kullanicicadan alinan "0"i yazdirma

                isimler.add(kullaniciGirdisi);
            }
        }
        return isimler;
    }
}
