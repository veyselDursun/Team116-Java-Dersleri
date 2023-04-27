package day08_stringManipulations;

public class C05_indexOfEksiiikkkk {
    public static void main(String[] args) {

        String str = "Java en iyisi";
        System.out.println(str.indexOf("e")); //5
        System.out.println(str.indexOf("a")); //1 ilk a 'yi alir ikinci a'ya gitmez
        System.out.println(str.indexOf("en")); //5
        System.out.println(str.indexOf("iyi")); //8
        System.out.println(str.indexOf("yi")); //9

        System.out.println("================");

        System.out.println(str.indexOf("o")); // olmayinca output -1
        System.out.println(str.indexOf("en guzeli")); //-1

        System.out.println("================");

      // str fromIndex istedigin aramayi belirledigin indexten sonrasina bakar
        // index numarasi degismez

        System.out.println(str.indexOf("a", 2)); //3
        System.out.println(str.indexOf("a", 5)); //-1
        System.out.println(str.indexOf("i", 8)); //8
        System.out.println(str.indexOf("i")); //8
        System.out.println(str.indexOf("i", 6)); //8
        System.out.println(str.indexOf("i", 9)); //10
        System.out.println(str.indexOf("i", 11)); //12


        System.out.println("**************Soru******");


        // Verilen bir cumlede, istenilen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        //1-Aradiginiz kelime cumlede 1 kere kullanilmis
        //2-Aradiginiz kelime cumlede 2 kere veya daha fazla kullanilmis
        //"Java en iyisi" icerisinde "en" kelimesi icin

        // String str = "Java en iyisi"; yukarida yazildigi icin yazmadik

        if (str.indexOf("en")==-1){
            System.out.println("Bu cumlede aradiginiz kelime yok");
        }
        else {
            int birinciKelimeIndex = str.indexOf("en");
        }



    }
}
