package day13_arrays;

import java.util.Arrays;

public class C07_TumElemanlariArtir {
    
    //Soru 1- Verilen bir int array’in tum elemanlarini 
    // istenilen deger kadar bize donduren bir method olusturun. 
    // Eski array’i yeni haliyle kaydedin.

    public static void main(String[] args) {

        int[] arr = {3,5,7,2,1,9};
        int artisMiktari =6;

        arr= tumElemanlariArtir(arr,artisMiktari);

        System.out.println(Arrays.toString(arr));

    }
    
    public static int[] tumElemanlariArtir(int[] arr, int artisMiktari){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] +artisMiktari;
        }
        return arr;
        
    }
}
