package day15_multiDimensionelArrays;

import java.util.Arrays;

public class C03_MDA {

    // Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
    // yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
    // input :     int[][] arr = {{3,4,5}, {2,3,6,7}};
    // output:                      [5, 7, 11]

    public static void main(String[] args) {

        // ortak index dedigi icin, kisa olanin uzunlugunu belirlemek lazim

        int[][] arr =  {{3,4}, {2,3,6,7}};
        int uzunluk = arr[0].length<arr[1].length ? arr[0].length : arr[1].length ; //Loop u ternary da yaptik
        int[] ortakElementArr = new int[uzunluk];
        for (int i = 0; i < ortakElementArr.length ; i++) {
            ortakElementArr[i] = arr[0][i]+arr[1][i];
        }
        System.out.println(Arrays.toString(ortakElementArr));
        // [5, 7, 11]







    }
}
