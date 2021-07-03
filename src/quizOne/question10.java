package quizOne;

public class question10 {
        private static class Person {
            String firstName;
            String lastName;

            public Person () {}
            public Person (String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }
        }
        private static class Employee extends Person {
            int age;
            public Employee (String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }
            public Employee (String firstName, String lastName, int age){
                super(firstName, lastName);
                this.age = age;
            }
            public Employee (int age){
                super("firstName", "lastName");
                this.age=age;
            }
        }

        public static void main(String[] args) {
           Employee employee = new Employee("Coding", "Book", 25);
           Employee employee2 = new Employee(55);
            System.out.println(employee.firstName + ":" +employee.lastName + ":" +employee.age);
            System.out.println(employee2.firstName + ":" +employee2.lastName + ":" +employee2.age);

        }
    }

