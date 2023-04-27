package day08_stringManipulations;

public class C02_contains {
    public static void main(String[] args) {
        String str = "Java ile hersey cok kolay";

        System.out.println(str.contains("java")); //false
        System.out.println(str.contains("Java")); //true

        String str1 = "cok";

        System.out.println(str1.contains("a"));//
        System.out.println(str1.contains(" "));//

        System.out.println(str.contains(""));//
        System.out.println(str.contains("Java"));//



    }
}
