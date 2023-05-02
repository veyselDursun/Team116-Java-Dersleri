package day22_stringBuilder_accessModifier;

public class C06_AccessModifierKullanim {

    public static void main(String[] args) {

        // baska class'daki static class uyelerinden
        // private olmayanlara direk class ismi ile ulasabiliriz
        System.out.println(C05_AccessModifier.defaultStaticSayi);
        C05_AccessModifier.defaultStaticMethod();
        // ayni package icinde baska class'daki static olmayan class uyelerinden
        // private olanlar haric tamamina obje ile erisebiliriz

        C05_AccessModifier obj = new C05_AccessModifier();
        System.out.println(obj.defaultStr);
        obj.protectedMethod();
    }
    void baskaClassdanKullanimMethodu(){
        System.out.println(C05_AccessModifier.publicStaticSayi);
        C05_AccessModifier obj = new C05_AccessModifier();
        System.out.println(obj.defaultStr);
        obj.protectedMethod();
    }
}