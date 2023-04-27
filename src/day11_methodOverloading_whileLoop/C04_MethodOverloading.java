package day11_methodOverloading_whileLoop;

public class C04_MethodOverloading {
    public static void main(String[] args) {


        topla(4,5);
        topla('a','b');
        topla(3.2f ,5.1f);
    }
    public static void topla(double sayi1, double sayi2){
        System.out.println("Iki double'in toplami : " + (sayi1+sayi2));
    }

}
