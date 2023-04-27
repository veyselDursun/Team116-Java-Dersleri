package day08_stringManipulations;

public class C06_lastIndexOf {
    public static void main(String[] args) {

        String str = "Java cok faydali";

        System.out.println(str.lastIndexOf("a")); //13
        System.out.println(str.lastIndexOf("a", 12)); //10
        System.out.println(str.lastIndexOf("a", 10)); //10


        System.out.println("************************");

        System.out.println(str.indexOf("a")); //1
        System.out.println(str.lastIndexOf("a")); //13
        System.out.println(str.lastIndexOf("a", 2)); //1
        System.out.println(str.lastIndexOf("a", 1)); //1

        System.out.println("========");

        System.out.println(str.indexOf("o")); //6
        System.out.println(str.lastIndexOf("o")); //6

        System.out.println(str.indexOf("cok")); //5
        System.out.println(str.lastIndexOf("cok")); //5

        System.out.println(str.indexOf("k")); //7
        System.out.println(str.lastIndexOf("k"));//7

    }
}
