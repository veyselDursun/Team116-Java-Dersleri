package aaTekrar;

public class NestedTernary {
    public static void main(String[] args) {

        int a=5;
        int b=20;


        System.out.println(a > b ? a > 0 ? 100 : 50 : a < 20 ? a + 5 : a-5);

        System.out.println(a < b ? b > 0 ? a+b : b-a : a < 10 ? a * 5 : b/a);

        System.out.println(a == b ? a > b ? a : b : a < b ? a + b : a-b);

    }
}
