import java.util.Comparator;

public class Employee {
        private String name;
        private int salary;
        private String hireDate;

        public Employee(String name, int salary, String hireDate) {
            this.name = name;
            this.salary = salary;
            this.hireDate = hireDate;
        }

        public void increaseSalary() {
            salary += 1000;
        }

        public static void increaseSalary(Employee[] employees) {
            for (Employee employee : employees) {
                if (!(employee instanceof Manager)) {
                    employee.increaseSalary();
                }
            }
        }

        public static class DateComparator implements Comparator<Employee> {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                String[] date1 = emp1.hireDate.split("-");
                String[] date2 = emp2.hireDate.split("-");

                for (int i = 0; i < 3; i++) {
                    int d1 = Integer.parseInt(date1[i]);
                    int d2 = Integer.parseInt(date2[i]);

                    if (d1 < d2) {
                        return -1;
                    } else if (d1 > d2) {
                        return 1;
                    }
                }

                return 0;
            }
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", hireDate='" + hireDate + '\'' +
                    '}';
        }
    }
