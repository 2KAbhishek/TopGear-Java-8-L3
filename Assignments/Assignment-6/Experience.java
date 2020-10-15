import java.time.LocalDate;
import java.time.Period;

public class Experience {
    public static void main(String[] args) {
        LocalDate start = LocalDate.parse("2020-09-28");
        LocalDate now = LocalDate.now();
        Period p = Period.between(start, now);
        System.out.println("Experience in Wipro:\nYears: " + p.getYears() + "\nMonths: " + p.getMonths() + "\nDays: "
                + p.getDays());
    }
}
