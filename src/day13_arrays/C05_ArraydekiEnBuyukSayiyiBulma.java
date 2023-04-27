package day13_arrays;

public class C05_ArraydekiEnBuyukSayiyiBulma {

    // Verilen int Array'deki en buyuk sayiyi bize donduren bir method olusturun

    public static void main(String[] args) {

        int[] arr = {2,4,6,8,1,3,7,5};
        System.out.println(enBuyukSayi(arr));
    }
    public static int enBuyukSayi(int[] arr){
        int enBuyukSayi=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > enBuyukSayi){
                enBuyukSayi= arr[i];
            }
        }
        return enBuyukSayi;

    }
}
