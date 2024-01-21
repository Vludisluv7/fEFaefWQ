import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
                Employee employee1 = new Employee("Иванов", 5000, "2021-01-01");
                Employee employee2 = new Employee("Петров", 6000, "2020-12-01");
                Manager manager = new Manager("Сидоров", 8000, "2022-03-01");

                Employee[] employees = {employee1, employee2, manager};

                System.out.println("Исходные данные:");
                for (Employee employee : employees) {
                    System.out.println(employee);
                }

                Employee.increaseSalary(employees);

                System.out.println("\nПовышение зарплаты:");
                for (Employee employee : employees) {
                    System.out.println(employee);
                }

        }


    }

