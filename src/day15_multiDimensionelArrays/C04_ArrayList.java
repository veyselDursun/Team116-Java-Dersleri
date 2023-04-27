package day15_multiDimensionelArrays;

import day14_arrays.C10_KullanicidanAldigimizDegeriArrayeEkleme;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class C04_ArrayList {

    // Array uzunlugu degistirilemedigi icin calisma ortaminda pek tercih edilmez.
    // Java ekleme ve silme yapabilecegimiz bir yapi olusturmustur
    // ArrayList, Array alt yapisini kullanir ama uzunluk acisindan esnektir
    public static void main(String[] args) {

        // asagidaki Array'e element olarak 10' ekleyin

        int[]arr = {3,5,6};
        arr = C10_KullanicidanAldigimizDegeriArrayeEkleme.kullaniciArrayElemanEkleme(arr);
        arr = C10_KullanicidanAldigimizDegeriArrayeEkleme.kullaniciArrayElemanEkleme(arr);
        arr = C10_KullanicidanAldigimizDegeriArrayeEkleme.kullaniciArrayElemanEkleme(arr);

        System.out.println(Arrays.toString(arr));



    }
}
