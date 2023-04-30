package aaTekrar;

import java.net.SocketTimeoutException;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class saat {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();

        System.out.println("Saat:" + saat);

        System.out.println(saat.getHour());

        System.out.println(saat.getMinute());

        System.out.println(saat.withHour(14));

        System.out.println(saat.withHour(14).withSecond(45).withMinute(35));

        System.out.println(saat.plusHours(100));

        System.out.println(saat.minusHours(20));


        LocalTime istenilenZaman = LocalTime.of(12,23,15,10);

        System.out.println(istenilenZaman);
        System.out.println(istenilenZaman.isBefore(saat));
        System.out.println(istenilenZaman.isAfter(saat));

    }
}
