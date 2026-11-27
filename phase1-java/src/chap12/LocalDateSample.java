package chap12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSample {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        
        LocalDate releaseDate = LocalDate.of(2026, 7, 1);
        System.out.println(releaseDate.getYear());
        System.out.println(releaseDate.getMonthValue());
        System.out.println(releaseDate.getDayOfMonth());
        
        LocalDate deadline = releaseDate.plusDays(30);
        System.out.println(deadline);
        
        System.out.println(releaseDate.isBefore(deadline));
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日");
        System.out.println(releaseDate.format(formatter));
        

    }

}
