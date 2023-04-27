package day21_dateTime_varargs;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

    public static void main(String[] args) {
        LocalDateTime ts = LocalDateTime.now();
        System.out.println(ts); //2023-04-25T11:05:46.757247900

        // tarih ve saati su sekilde yazdirin 25/04/2023

        System.out.println(ts.getDayOfMonth() + "/" + ts.getMonthValue() + "/" + ts.getYear() +
                " " + ts.getHour() + ":" + ts.getMinute()); //25/4/2023 11:9

        System.out.println(ts.plusHours(100)); //2023-04-29T15:10:15.406730600
    }
}
