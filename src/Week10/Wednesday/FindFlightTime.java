package Week10.Wednesday;

import java.time.*;

public class FindFlightTime {
    public static void main(String[] args) {
        /**
         * Flight from NY at 6:30 local time
         * arriving to Monaco at 22:10 local time
         * find the duration*/
        // Departure and arrival times in local time zones
        LocalTime departureTime = LocalTime.of(6, 30);
        LocalTime arrivalTime = LocalTime.of(22, 10);

        // Define time zones
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZoneId monacoZone = ZoneId.of("Europe/Monaco");

        // Get ZonedDateTime for departure and arrival considering time zones
        ZonedDateTime departureZonedTime = ZonedDateTime.of(LocalDateTime.now(), newYorkZone);
        ZonedDateTime arrivalZonedTime = ZonedDateTime.of(LocalDateTime.now(), monacoZone);

        // Set the departure and arrival times
        departureZonedTime = departureZonedTime.withHour(departureTime.getHour()).withMinute(departureTime.getMinute()).withSecond(0).withNano(0);
        arrivalZonedTime = arrivalZonedTime.withHour(arrivalTime.getHour()).withMinute(arrivalTime.getMinute()).withSecond(0).withNano(0);

        // Adjust arrival time in case it's before departure (next day)
        if (arrivalZonedTime.isBefore(departureZonedTime)) {
            arrivalZonedTime = arrivalZonedTime.plusDays(1);
        }

        // Calculate the duration of the flight
        Duration duration = Duration.between(departureZonedTime, arrivalZonedTime);

        // Display the duration
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();
        System.out.println("Flight duration: " + hours + " hours " + minutes + " minutes");


    }
}
