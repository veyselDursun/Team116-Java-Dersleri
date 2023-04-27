package aaTekrar;

public class SwitchCase {

    //Haftanin gunlerini sayi ile alipyazdirin

    public static void main(String[] args) {
        int sayi=9;

        switch (sayi){
            case 1: //System.out.println("Pazartesi"); break;
            case 2: //System.out.println("Sali"); break;
            case 3: //System.out.println("Carsamba"); break;
            case 4: //System.out.println("Persembe"); break;
            case 5: //System.out.println("Cuma"); break;
                    System.out.println("Hafta ici"); break;
            case 6: //System.out.println("Cumartesi"); break;
            case 7: //System.out.println("Pazar"); break;
                     System.out.println("Hafta sonu"); break;
            default:
                System.out.println("Hatali giris");
        }
    }
}
