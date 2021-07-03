/*package quizOne;

import java.util.Arrays;
import java.util.List;

public class question11 {
        private static class Employee {
            String name;
            int height;

            public Employee(String name, int height) {
                this.name = name;
                this.height = height;
            }

            public boolean checkHeight(Predicate<Employee> predicate) {
                return predicate.test(this);
            }
        }

        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                    new Employee("July", 125),
                    new Employee("Jane", 135),
                    new Employee("John", 129),
                    new Employee("Jason", 132)
            );

            for(Employee employee: employees) {
                if(employee.checkHeight(Employee e -> e.height > 130)) {
                    System.out.println(employee.name);
                }
            }
        }
    }

*/