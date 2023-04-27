package day08_stringManipulations;

public class C08_nullPointer {
    public static void main(String[] args) {

        String str = null; // deger atanmadigi icin yazdirma ve islemleri yapilamiyor
        System.out.println(str);

        // null bir deger degildir
        // null bir pointerdir
        // non-primitive datalara deger atanmadigini isaret eder

        // System.out.println(str); // deger atama yapilmadan normalde yazdirma yapilamaz

        // yinede deger atamasi yapmadan , bos olarak kalmasini, lakin
        // en azindan yeri geldigi zaman en azindan yazdirilabilmesini istiyorsak
        // null pointer kullanilir.

        String test = ""; // burada testin icinde ""kayit altina alinmis. Kullanilabilir.

        System.out.println(test.length());

        System.out.println(str+"Ali"); //nullAli

        Integer sayi =null;

        System.out.println(test.isEmpty()); //true

        // null atamasi yapilan bir variable hic bit method ile kullanilmaz!!!
        //yazdirilabilir veya + ile kullanilabilir.

    }
}
