package day07_switchStatements_StringManipulations;

public class C08_equals {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "JaVa";
        String str6 = new String ("Java");


        // Normalde non-primitive data turundeki objeler, new keyword'u ile olusturulur.
        //
        //
        //


        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //false
        System.out.println(str4.equals(str5)); //false

        System.out.println(str2.equals(str6)); //true


        /*
        equals() verilen iki String'in metin
         */

        System.out.println(str1 ==str2); // true
        System.out.println(str1 ==str3); // false
        System.out.println(str1 ==str6); // false Java ==Java
    }
}
