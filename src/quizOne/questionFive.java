package quizOne;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class questionFive {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 10, 04, 13, 0, 0);
        localDateTime.plusDays(27);
        localDateTime.plusHours(12);
        localDateTime.plusMonths(1);
        System.out.println(localDateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
    }
}
