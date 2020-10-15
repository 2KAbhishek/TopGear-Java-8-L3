import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, 100.0, "James", "Kolkata");
        Employee emp2 = new Employee(2, 200.0, "Kames", "Colkata");
        Employee emp3 = new Employee(3, 900.0, "Lames", "Lolkata");
        Employee emp4 = new Employee(4, 50.0, "Names", "Tolkata");
        Employee emp5 = new Employee(5, 500.0, "Pames", "Bolkata");

        ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        Collections.sort(empList, new SotBySal());

        empList.forEach(emp -> System.out.println(
                "ID : " + emp.id + " Name : " + emp.name + " Salary : " + emp.sal + " Address : " + emp.address));
    }

}
