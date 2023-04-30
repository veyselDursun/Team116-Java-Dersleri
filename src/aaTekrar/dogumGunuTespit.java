package aaTekrar;

import java.time.LocalDate;

public class dogumGunuTespit {
    public static void main(String[] args) {


        LocalDate dogumTarihi = LocalDate.of(2012,7,24);
        System.out.println("Yusuf Bera " + dogumTarihi.getDayOfWeek() + " günü dogdu");


    }
}
