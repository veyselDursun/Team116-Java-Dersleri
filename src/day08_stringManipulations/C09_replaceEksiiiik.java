package day08_stringManipulations;

public class C09_replaceEksiiiik {
    public static void main(String[] args) {
        String str = "Javasiz olmaz";
        System.out.println(str.replace('J', 'H'));

        System.out.println(str.replace("Javasiz", "X"));
        System.out.println(str.replace("v", "yayayaya"));
        System.out.println(str.replace("va", "lallala"));

        System.out.println(str);

        String str1 = "Java ile hayat Cok daha guzel";
        System.out.println(str1.replace(" ", "")); //JavailehayatCokdahaguzel

        System.out.println();

    }
}
