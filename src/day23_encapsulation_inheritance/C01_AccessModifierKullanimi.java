package day23_encapsulation_inheritance;
import day22_stringBuilder_accessModifier.C05_AccessModifier;
import java.util.Collections;
public class C01_AccessModifierKullanimi extends C05_AccessModifier{
    public static void main(String[] args) {
        // baska package'daki bir class'dan class uyelerinin
        // sadece public olanlari kullanabiliriz
        // eger bulundugumuz class ile ulasmak istedigimiz class arasinda
        // parent-child iliskisi varsa class uyelerine erisim mumkundur
        System.out.println(C05_AccessModifier.publicStaticSayi);
        C05_AccessModifier.publicStaticMethod();
        C05_AccessModifier.protectedStaticSayi=10;
        C05_AccessModifier.publicStaticSayi=25;
        System.out.println(C05_AccessModifier.publicStaticSayi); // 25
        System.out.println(C05_AccessModifier.protectedStaticSayi); // 10



        /*
            Access modifier ile erisimi duzenlenen bir class uyesine
            baska class'dan erisebilirsek
            hem deger atamasi yapabilir, hem de o class uyesinin degerini yazdirabiliriz
         */
    }
}
