package day08_stringManipulations;

public class C03_startsWith_endsWith {
    public static void main(String[] args) {

        String str = "Java cok eglenceli";

        System.out.println(str.startsWith("java"));
        System.out.println(str.startsWith("Java"));
        System.out.println(str.startsWith(str)); // her yazi kendisiyle baslar
        System.out.println(str.startsWith("")); // herseyin basinda hicbirsey yoktur


        System.out.println("==========================");

        System.out.println(str.endsWith("a")); //false
        System.out.println(str.endsWith("eglenceli")); //true
        System.out.println(str.endsWith("celi"));
        System.out.println(str.endsWith("Java cok eglenceli"));


        System.out.println("========================");

        System.out.println(str.length()); //18

    }

}
