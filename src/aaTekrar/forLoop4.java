package aaTekrar;

import java.util.Scanner;

public class forLoop4 {

    /*
        Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip
                            kaydedin
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("String bir deger giriniz");
        String str = scanner.next();

        String strTers="";
        for (int i = str.length()-1; i >=0 ; i--) {

            System.out.print(str.charAt(i));

                                                /* ikinci Yol===>
                                                 for (int i = str.length()-1; i >=0 ; i--) {
                                                strTers = str.substring (i ,i+1);
                                                 System.out.print(strTers);
                                                 */

        }

    }
}
