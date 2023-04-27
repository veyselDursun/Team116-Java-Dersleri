package day06_nestedIfElseStatements_ternaryOperators;

public class C06_Ternary {
    public static void main(String[] args) {

        //Verilen sayi pozitif ise iki katina cikarin
        //verilen sayi negatif ise 10 ilave edin


        int sayi = 10;
       sayi = sayi>0 ? 2*sayi : sayi+10 ;

        //Ternary bize sonuc verir, bu sonucu ya direk yazdirmaliyiz veya variable 'a atamaliyiz

        System.out.println("1.Sonuc = " + sayi);


        // sayi cift ise 2 katini yazdirin, tek ise "sayi tek" yazdirin.

        System.out.println(sayi%2==0 ? 2*sayi : "tek sayi");


    }
}
