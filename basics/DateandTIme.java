package basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateandTIme {
    public static void main(String[] args) 
    {
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());

        System.out.println(LocalDateTime.now());
       // ZoneId.getAvailableZoneIds().forEach(System.out::println);

        System.out.println(LocalTime.now(ZoneId.of("America/Cuiaba")));
        System.out.println(LocalTime.now(ZoneId.of("US/Michigan")));
        
    }
}
