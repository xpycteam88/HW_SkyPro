package kursovaiya1;

import java.util.Arrays;

public class EmployeesList {
    private final Employee[] employees;
    private int count;


    public EmployeesList() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String employeeFullName, int employeeOtdel, int employeeSalary) {
        if (count >= employees.length) {
            System.out.println("Невохможно добавить сотрудника, закончилось место");
        }
        Employee newEmployee = new Employee(employeeFullName, employeeOtdel, employeeSalary);
        employees[count++] = newEmployee;
    }

    public double sumSalary() {
        double sumSalary = 0;
        for (int i = 0; i < count; i++) {
            sumSalary += employees[i].getSalary();
            ;
        }
        return sumSalary;
    }

    public double averageSalaryEmloyees() {
        double averageSalary = (sumSalary() / count);
        return (float) averageSalary;
    }

    public Employee findMinSalary() {
        Employee minSalary = employees[0];
        for (int i = 0; i < count; i++) {
            if (employees[i].getSalary() < minSalary.getSalary()) {
                minSalary = employees[i];
            }
        }
        return minSalary;
    }

    public Employee findMaxSalary() {
        Employee maxSalary = employees[0];
        for (int i = 0; i < count; i++) {
            if (employees[i].getSalary() > maxSalary.getSalary()) {
                maxSalary = employees[i];
            }
        }
        return maxSalary;
    }

    public void printSalaryLess(double value) {
        System.out.println("\nСписок сотрудников с ЗП меньше " + value + " руб.");
        for (int i = 0; i < count; i++) {
            if (employees[i].getSalary() < value) {
                System.out.println(employees[i].printIdFullnameSalary());
            }
        }
    }

    public void printSalaryMoreOrEqual(double value) {
        System.out.println("\nСписок сотрудников с ЗП больше (или равно) " + value + " руб.");
        for (int i = 0; i < count; i++) {
            if (employees[i].getSalary() >= value) {
                System.out.println(employees[i].printIdFullnameSalary());
            }
        }
    }

    public void printAllEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void printAllEmployeesName() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    public void printAllEmployeesNameAndSalary() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].printFullnameSalary());
        }
    }

    public void indexSalaryEmloyees(double percent) {
        double indexSalary = percent / 100; // 100 is 100%
        for (int i = 0; i < count; i++) {
            double salary = employees[i].getSalary() * indexSalary;
            employees[i].setSalary(employees[i].getSalary() + salary);

        }
    }

    public void printEployeesOtdel(int otdel) {
        System.out.println("\nСписок сотрудников отдела " + otdel + " (человек в отделе: " + employeesInOtdel(otdel) + ')');
        for (int i = 0; i < count; i++) {
            if (employees[i].getOtdel() == otdel) {
                System.out.println(employees[i].printEmployeeExceptOtdel());
            }
        }
    }

    public Employee findMinSalaryInOtdel(int otdel) {
        Employee minSalaryInOtdel = employees[0];
        for (int i = 0; i < count; i++) {
            if (employees[i].getOtdel() == otdel) {
                minSalaryInOtdel = employees[i];
                break;
            }
        }
        for (int i = 0; i < count; i++) {
            if (employees[i].getOtdel() == otdel && employees[i].getSalary() < minSalaryInOtdel.getSalary()) {
                minSalaryInOtdel = employees[i];
            }
        }
        return minSalaryInOtdel;
    }

    public Employee findMaxSalaryInOtdel(int otdel) {
        Employee maxSalaryInOtdel = employees[0];
        for (int i = 0; i < count; i++) {
            if (employees[i].getOtdel() == otdel) {
                maxSalaryInOtdel = employees[i];
                break;
            }
        }
        for (int i = 0; i < count; i++) {
            if (employees[i].getOtdel() == otdel && employees[i].getSalary() > maxSalaryInOtdel.getSalary()) {
                maxSalaryInOtdel = employees[i];
            }
        }
        return maxSalaryInOtdel;
    }

    public double sumSalaryInOtdel(int otdel) {
        double sumSalaryInOtdel = 0;
        for (int i = 0; i < count; i++) {
            if (employees[i].getOtdel() == otdel) {
                sumSalaryInOtdel += employees[i].getSalary();
            }
        }
        return sumSalaryInOtdel;
    }

    public int employeesInOtdel(int otdel) {
        int counter = 0;
        for (int i = 0; i < count; i++) {
            if (employees[i].getOtdel() == otdel) {
                counter++;
            }
        }
        return counter;
    }

    public double averageSalaryEmloyeesInOtdel(int otdel) {
        double v = sumSalaryInOtdel(otdel) / employeesInOtdel(otdel);
        return v;
    }

    public void indexSalaryEmloyeesInOtdel(int otdel, double percent) {
        double indexSalaryInOtdel = percent / 100; // 100 is 100%
        for (int i = 0; i < count; i++) {
            if (employees[i].getOtdel() == otdel) {
                double salary = employees[i].getSalary() * indexSalaryInOtdel;
                employees[i].setSalary(employees[i].getSalary() + salary);
            }

        }
    }

}