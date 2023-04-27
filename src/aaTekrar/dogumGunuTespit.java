package aaTekrar;

import java.time.LocalDate;

public class dogumGunuTespit {
    public static void main(String[] args) {


        LocalDate dogumTarihi = LocalDate.of(1997,7,5);
        System.out.println(dogumTarihi.getDayOfWeek());
    }
}
