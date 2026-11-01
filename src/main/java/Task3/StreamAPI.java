package Task3;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {

    public static void main(String[] args) {

        ArrayList<Employee> employeeList = new ArrayList<>(
                List.of(
                        new Employee("Alex", 37, "system-design", 3495.9),
                        new Employee("Mark", 68, "Junior-service-staff", 300.1),
                        new Employee("Canady", 41, "SEO", 5915672.4),
                        new Employee("Olga", 28, "HR", 1359.3),
                        new Employee("Alexey", 19, "Senior-developer", 300000.0)
                )
        );

        System.out.println("Все коллеги: \n" + employeeList + "\n");
        System.out.println("Коллеги возрастом >30 лет: \n" + employeeList.stream().filter(x -> x.getAge() > 30).toList());

    }
}
