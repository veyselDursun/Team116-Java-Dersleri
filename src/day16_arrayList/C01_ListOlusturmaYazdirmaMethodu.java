package day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ListOlusturmaYazdirmaMethodu {
    public static void main(String[] args) {

        List<String> isimler= new ArrayList<>();
        isimler.add("Ahmet");
        isimler.add("Murat");
        isimler.add("Muhammet");
        isimler.add("Sefa");
        isimler.add("Erhan");

        listeYazdirma(isimler); //method call : method cagirma

    }
    // sadece konsola yazi yazdiracaksa void return type kullanilir.

    public static void listeYazdirma (List<String>isimler){

        System.out.println(isimler);
    }
}
