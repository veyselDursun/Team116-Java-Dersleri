package aaTekrar;

import java.time.LocalDate;
import java.time.Period;

public class Period_yas {

    public static void main(String[] args) {


            LocalDate dogumtarihi= LocalDate.of(1979,7,5);
            LocalDate bugun= LocalDate.now();
            Period yasVeysel = Period.between(dogumtarihi,bugun);

            System.out.println(yasVeysel); //P 43Y 9M 25D
            System.out.println("Veysel'in yasi : "+yasVeysel.getYears());

    }
}
