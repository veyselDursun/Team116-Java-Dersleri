package day32_Maps;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapMethodlar {
    // bu class'da static method'lar olusturalim ki
    // her yerden class ismi ile kullanabilelim
    // map ve ogrenci numarasi verdigimizde, istenen formatta isim soyisim bilgisini
    // bize donduren bir method olusturalim
    public static String numaraIleOgrenciBulma(Map<Integer,String> ogrenciMap,int ogrenciNo){
        // 1- istenen numaraya ait value'yu kaydedelim
        String ogrenciValue= ogrenciMap.get(ogrenciNo); // Ali-Cem-11-K-TM
        // 2- tek bir String olan value'yu bilgileri alabilmek icin split edelim
        String[] valueArr = ogrenciValue.split("-"); // [Ali, Cem, 11, K, TM]
        // 3- istenen bilgileri alip, istenen formatta kaydedelim
        String isim = valueArr[0];
        String soyisim = valueArr[1];
        String formataUygunIsimSoyisim = isim.substring(0,1).toUpperCase() +
                isim.substring(1).toLowerCase()+
                " "+
                soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).toLowerCase();
        return formataUygunIsimSoyisim;
    }
    public static Map<Integer,String> ogrenciMapOlustur(){
        Map<Integer,String> ogrenciMap= new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        return ogrenciMap;
    }
    public static void tumOgrenciListesiYazdir(Map<Integer,String> ogrenciMap){
        // tum ogrencilerin isim ve soyisimlerini bir liste olarak yazdirin
        // tum ogrencilere ulasabilmek icin, tum ogrencilerin key'lerine ihtiyacimiz var
        Set<Integer> ogrenciKeySeti= ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106]
        // tum key'leri tek tek ele alip
        // o key'e ait isim ve soyismi, yukaridaki method'u kullanarak yazdiralim
        int siraNo=1;
        for (Integer eachKey: ogrenciKeySeti
        ) {
            // her bir key'e ait isim soyismi yazdiralim
            System.out.println(siraNo+"- "+numaraIleOgrenciBulma(ogrenciMap, eachKey));
            siraNo++;
        }
    }
    public static void istenenSiniftakiOgrencileriYazdir(Map<Integer, String> ogrenciMap, int sinif) {
        // istenen siniftaki tum ogrencilerin isim ve soyismlerini yazdirin
        // value'lari kaydedelim
        Collection<String> valueCollection = ogrenciMap.values();
        // siniflari kontrol edip, istenen siniftaki ogrencileri yazdirmak icin
        // herbir value'yu gozden gecirmeliyiz
        int siraNo=1;
        for (String eachValue: valueCollection
        ) { // Ali-Can-11-H-MF
            // herbir value'yu split edip, class bilgisini kontrol etmeliyiz
            String[] eachValueArr= eachValue.split("-"); // [Ali, Can, 11, H, MF]
            // array'den sinif bilgisini kontrol edip
            // istenen sinif degerine esit ise
            // isim ve soyisim degerlerini yazdiralim
            if (eachValueArr[2].equals(sinif+"")) {
                System.out.println(siraNo +"- "+ eachValueArr[0]+" "+eachValueArr[1] +" " + eachValueArr[2]);
                siraNo++;
            }
        }
    }
    public static void numaraAraligindakiOgrencileriyazdir(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {
        // ogrenci numarasi verilen iki deger arasinda olan (sinir degerleri dahil)
        // tum ogrencilerin numara, isim, soyisim ve bolumlerini yazdirin
        // ogrencileri numaralarina gore kontrol edebilmek icin tum key'lere ihtiyacim var
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106]
        int siraNo=1;
        for (Integer eachKey : ogrenciKeySeti
        ) { // 101
            if (basNo<= eachKey && eachKey<=bitNo){
                // istenen araliktaki key'ler buraya ulasir, ornegin 103
                // burada o key'e ait isim, soyisim ve bolum'e ulasmaliyiz
                String value = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF
                String[] valueArr= value.split("-"); // [Ali, Can, 11, H, MF]
                System.out.println( siraNo +"- "+
                        eachKey + " "+
                        valueArr[0]+ " "+
                        valueArr[1]+ " "+
                        valueArr[4]);
                siraNo++;
            }
        }
    }
    public static Map<Integer, String> numaraIleSoyisimUpdateEt(Map<Integer, String> ogrenciMap, int ogrNo, String yeniSoyisim) {
        // 102 numarali ogrencinin value'sunu kaydet  Veli-Cem-10-K-TM
        String value=ogrenciMap.get(ogrNo);
        // update yapabilmek icin bilgileri split etmeliyiz [Veli, Cem, 10, K, TM]
        String[] valueArr = value.split("-");
        // bu array'de soyisim olarak yeni soyismi atayabilirim [Veli, Han, 10, K, TM]
        valueArr[1]= yeniSoyisim;
        // bu array'deki guncel bilgileri value yapisina uygun olarak yeniden birlestirmeliyiz
        // Veli-Han-10-K-TM
        value= valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];
        // 102 numarali ogrenciyi yeni value'su ile map'e ekleyelim
        ogrenciMap.put(ogrNo,value);
        // key'ler unique oldugu icin
        // varolan bir elementi yeniden eklemek isterseniz
        // key varoldugu icin, eski value'yu silip, yeni value yapar
        return ogrenciMap;
    }
}
