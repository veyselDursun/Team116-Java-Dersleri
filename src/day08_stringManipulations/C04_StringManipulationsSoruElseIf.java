package day08_stringManipulations;

import java.util.Scanner;

public class C04_StringManipulationsSoruElseIf {
    public static void main(String[] args) {

        //SORU : kullanicidan bir mail alin
        // - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen email giriniz");
        String email = scan.next();

        if (!email.contains("@")){  // ! icermiyorsa olumsuzluk katar
            System.out.println("Gecersiz email");
        }

        else if (!email.contains("@gmail.com")){
            System.out.println("email gmail olmali");
        }

        else if (!email.endsWith("gmail.com")){
            System.out.println("emailde yazim hatasi var");
        }

    }
}
