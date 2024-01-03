package Week10.Wednesday;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;


public class DateTimePractice {
    public static void main(String[] args) {
//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
//        days - month - year
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        String currentDateFormatted = localDate.format(formatter);
//        System.out.println(currentDateFormatted);
//        LocalDateTime updatedDate = localDateTime.plusDays(2).minusHours(5);
//
//
//        System.out.println(updatedDate);

//        LocalDate date1 = LocalDate.of(2022, 6, 15);
//        LocalDate date2 = LocalDate.of(2023, 6, 15);
//
//        System.out.println(date1.format(formatter));
//        System.out.println(date2.format(formatter));
//        boolean isAfter = date1.isAfter(date2);
//        System.out.println(isAfter);
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZonedDateTime newYorkTime = ZonedDateTime.now(newYorkZone);
//        System.out.println(newYorkTime);
        Set<String> zoneIDs = ZoneId.getAvailableZoneIds();
        int count = 1;
        for (String zoneId:zoneIDs) {
            System.out.print(count+": ");
            System.out.println(zoneId);
            count++;
        }
    }
}
