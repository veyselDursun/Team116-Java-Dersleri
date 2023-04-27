package day13_arrays;

public class C08_ArraydeElemanArama {

    //Soru 4- Verilen bir array’de
    // istenen bir elemanin var olup olmadigini
    // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

    public static void main(String[] args) {

        String[] sinifListesi = {"","","","",""};
        String arananIsim="Isa";
        arrayElemanBul(sinifListesi,arananIsim);
    }

    public static void arrayElemanBul(String[] arr , String arananIsim){

        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(arananIsim)){
                sayac++;
            }
        }
        if (sayac ==0){
            System.out.println("Aradiginiz isim sinif listesinde yok");
        }else{
            System.out.println("Aradaiginiz isim sinif listesinde " + sayac+ " adet bulunuyor");
        }

    }
}
