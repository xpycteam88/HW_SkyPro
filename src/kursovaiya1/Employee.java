package kursovaiya1;

import java.util.Objects;

public class Employee {
    private final String fullName;
    private int otdel;
    private double salary;

    private int id;

    public Employee(String fullName, int otdel, double salary) {
        this.fullName = fullName;
        this.otdel = otdel;
        this.salary = salary;
        this.id = AvtoCounter.getCounter();
    }

    public String getFullName() {
        return fullName;
    }

    public int getOtdel() {
        return otdel;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID " + id + " ФИО: " + fullName + "; " +
                "Отдел: " + otdel + "; " + "Зарплата: " + salary + " руб. ";
    }

    public String printIdFullnameSalary() {
        return "ID " + id + " ФИО: " + fullName + "; " +
                "Зарплата: " + salary + " руб. ";
    }

    public String printFullnameSalary() {
        return "ФИО: " + fullName + "; " +
                "Зарплата: " + salary + " руб. ";
    }

    public String printEmployeeExceptOtdel() {
        return "ID " + id + " ФИО: " + fullName + "; " + otdel + "; " + "Зарплата: " + salary + " руб. ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return otdel == employee.otdel && salary == employee.salary && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, otdel, salary);
    }
}
