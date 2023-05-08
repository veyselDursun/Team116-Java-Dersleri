package day26_InheritanceDataTypeKullanimi;

public class CAvciKuslar extends BKuslar {

    String hareket= "ucarlar";
    String beslenme= "et yerler";
    String pence= "pencelidir";
    String gaga= "sivri gagali";

    public static void main(String[] args) {

        /*Asagidaki 3 obje'de ayni constructor kullanmistir yani 3'u de avci kustur.
          Ama data turu farkli secildigi icin ozellikleri farkli olur.

          Bir obje olusturulurken ;
            Eger cons ve data turu ayni ise o class'a giddilir.
            Aranan ozellik varsa kullanilir, yoksa parent class'lara da bakilir ilk bulunan VARIABLE gecerli olur.
            Cons ve data turu farkli ise

         */

            CAvciKuslar avci1 = new CAvciKuslar();
        System.out.println(avci1.beslenme); // avcidan aldi - et yerler
        System.out.println(avci1.gaga); // avcidan aldi - sivri gagali
        System.out.println(avci1.cogalma); //kusdan aldi - yumurta ile cogalir
        System.out.println(avci1.kanat); //kusdan aldi - kanatlidir
        System.out.println(avci1.hareket); //avcidan aldi - ucarlar
        System.out.println(avci1.pence); // avcidan aldi - pencelidir
        System.out.println(avci1.solunum); //kusdan aldi - akcigerle nefes alirlar
        System.out.println(avci1.omur); // hayvandan aldi -yasar ve olurler


            BKuslar avciKusgiller = new CAvciKuslar(); //AvciKuslar is-a kuslar
        System.out.println(avciKusgiller.beslenme); // hayvandan aldi - et yerler
        System.out.println(avciKusgiller.gaga); // kusdan aldi - sivri gagali
        System.out.println(avciKusgiller.cogalma); // kusdan aldi - yumurta ile cogalir
        System.out.println(avciKusgiller.kanat); // kusdan aldi - kanatlidir
        System.out.println(avciKusgiller.hareket); // hayvandan aldi - ucarlar
            // System.out.println(avciKusgiller.pence);  CTE verir kuslar veya hayvanlar'da yok
        System.out.println(avciKusgiller.solunum); // kusdan aldi - akcigerle nefes alirlar
        System.out.println(avciKusgiller.omur); // hayvandan aldi - yasar ve olurler

             AHayvan avciHayvangiller = new CAvciKuslar(); // AvciKuslar is-a Hayvan
        System.out.println(avciHayvangiller.beslenme); // hayvandan aldi - et yerler
        // System.out.println(avciHayvangiller.gaga);  hayvanda yok CTE
        System.out.println(avciHayvangiller.cogalma); //kusdan aldi - cogalirlar
        // System.out.println(avciHayvangiller.kanat); hayvanda yok CTE
        System.out.println(avciHayvangiller.hareket); //hayvandan aldi - hareket ederler
        // System.out.println(avciHayvangiller.pence); hayvanda yok CTE
        System.out.println(avciHayvangiller.solunum); //hayvandan aldi - nefes alirlar
        System.out.println(avciHayvangiller.omur); // hayvandan aldi - yasar ve olurler
    }
}
