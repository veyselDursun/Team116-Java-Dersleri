package day05_ifElseStatements;

public class C01_basitIfStatement {

    public static void main(String[] args) {

        // bagimsiz if cumleleri kodun geriye kalani ile ilgilenmez
        // sarta odaklanir, sart true ise body calisir, false ise body calismaz
        // birden fazla bagimsiz id statement varsa
        // degerlere bagli olarak tum if body'lericalsabilecegi gibi,
        //hic bir if body'sinin calismamasi da mumkundur.

        int a = 21;
        int b = 75;

        if (a>b){

            System.out.println("a b'den buyuk");
        }
        if (a % 7==0){

            System.out.println("a 7'ye tam bolunur");
        }

        if (b % 5==0){

            System.out.println("b 5'ye tam bolunur");
        }

        if (a+b > 100){

            System.out.println("sayilarin toplami 100'den buyuk");
        }

        /*Egerif sartindan sonra {} kullanmaysak
        Java ilk ; 'ekadar olan kismi if body olarak kabul eder
        sonraki satirlarla ilgilenmez.

        eger if sartini yazdigimiz ()'den hemen sonra ; yazarsak
        if statement ;'de biter bu sarta bagli hic kod olmaz

         */


        /* if (b>0)                                     sadece ilk satir sarta bagli
            System.out.println("b sifirdan buyuk");
            System.out.println("b gercekten sifirdan buyuk");
            System.out.println("Valla b 0'dan buyuk");

        if (b>0);                                       hicbir kod sarta bagli degil
        System.out.println("b sifirdan buyuk");
        System.out.println("b gercekten sifirdan buyuk");
        System.out.println("Valla b 0'dan buyuk");

         */

        if (b>0) {

            System.out.println("b sifirdan buyuk");
            System.out.println("b gercekten sifirdan buyuk");
            System.out.println("Valla b 0'dan buyuk");
        }

        boolean c = a + 10 > b - 5 ;

        if (c) {
            System.out.println("Ozel sart saglandi");
        }
        if (true) {

            System.out.println("Bu yazi her zaman yazdirilir, cunku sart hep true");
        }

        if(false){
            System.out.println("Bu kod hic calismaz");
        }

    }

}