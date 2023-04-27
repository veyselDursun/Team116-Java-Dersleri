package day02_dataTurleri_Scanner_Tekrar;

public class C01_DataTurleri {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;      // boolean da sadece true false  olur

         char c1 = 'v';   // char tek tirnak ve tek karakter olmali bosluk da karakterdir

        String str1 = "v";
        String str2 = "5";

        int sayi1 = 5;   //32 bit hafiza
        short sayi2 = 5; //16 bit hafiza
        byte sayi3 = 5; //8 bit hafiza
        long sayi4 = 5; //64 hafiza

        float ond1 = 2.3456778888F;       //f de olabilir
        double ond2 = 3.536773889298766;

        System.out.println(ond1); //2.3456778888 float virgulden sonra 6 hane gosterir
        System.out.println(ond2); //3.536773889298766 double virgulden sonra 16 hane gosterir

        double d1 = 20;
        double d2 = 3;

        System.out.println(d1/d2); // 4.0 - 3.99999999999999 - 4.0000000000000001 yazabilir

    }
}
