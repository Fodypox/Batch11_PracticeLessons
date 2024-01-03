package Week10.Wednesday;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class findingOddNumbers {
    public static void main(String[] args) {
        LocalDateTime localDateTimeBefore = LocalDateTime.now();
        int count = 0;
        for (int i = 1; i <= 1000000000; i++) {
            if (i%2==1){
                count++;
            }
        }
        System.out.println(count);
        LocalDateTime localDateTimeAfter = LocalDateTime.now();
        System.out.println(localDateTimeBefore);
        System.out.println(localDateTimeAfter);
        Duration duration = Duration.between(localDateTimeBefore,localDateTimeAfter);
        System.out.println(duration);
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();
        long millis = duration.toMillisPart();

    }
}
