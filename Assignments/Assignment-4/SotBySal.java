import java.util.Comparator;

public class SotBySal implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.sal > e2.sal ? 1 : e1.sal < e2.sal ? -1 : 0;
    }
}
