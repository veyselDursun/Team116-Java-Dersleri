package day10_nestedForLoop_methodOlusturma;

public class C12_FaktoryelSonucuDondurme {
    public static void main(String[] args) {

        //verilen sayinin faktoryel degerini hesaplayip
        //sonucu donduren bir method olusturun

        System.out.println(faktoryelDegeriDondur(6)); // yazdirir

        int yediFaktoryel = faktoryelDegeriDondur(7); // kaydeder

    }
    public static int faktoryelDegeriDondur(int sayi){

        int faktoryel = 1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryel *= i;

        }
        return faktoryel;
    }
}
