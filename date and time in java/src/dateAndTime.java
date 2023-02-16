import java.sql.SQLOutput;
import java.time.*;


public class dateAndTime {

    public static void main(String[] args) {
        LocalTime t1 = LocalTime.now();
        System.out.println(t1);

        LocalDate D1 = LocalDate.now();
        System.out.println(D1);

        LocalDateTime  ld1 = LocalDateTime.now();
        System.out.println(ld1);

    }
}
