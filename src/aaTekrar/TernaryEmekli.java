package aaTekrar;

import java.util.Scanner;

public class TernaryEmekli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi yaziniz:\n K:Kadin E:Erkek ");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinizi giriniz: ");
        int yas = scanner.nextInt();

        System.out.println(  cinsiyet=='K' ? (yas>=60 ? "Emekli olabilirsin" : "Malesef emekli olamazsin") :

        (yas>=65 ? "Emekli olabilirsin" : "Malesef emekli olamazsin") );

    }
}
