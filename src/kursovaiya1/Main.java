package kursovaiya1;

public class Main {
    public static void main(String[] args) {
        int valueOtdel;
        EmployeesList employeesList = new EmployeesList();
        employeesList.addEmployee("Пустовит Александр Викторович", 1, 70000);
        employeesList.addEmployee("Репина Юлия Богдановна", 2, 40000);
        employeesList.addEmployee("Шолохова Елена Борисовна", 3, 45000);
        employeesList.addEmployee("Степанятов Сергей Сергеевич", 4, 35000);
        employeesList.addEmployee("Федоров Сергей Андреевич", 4, 40000);
        employeesList.addEmployee("Шумарина Ольга Ильнична", 5, 43000);
        employeesList.addEmployee("Кузьменко Дарья Викторовна", 5, 45000);
        employeesList.addEmployee("Батыгян Илья Ильич", 5, 50000);

        // критерии оценки
        // базовая сложность
        System.out.println("Список всех сотрудников со всеми данными:");
        employeesList.printAllEmployees(); // Cписок всех сотрудников со всеми данными

        System.out.println("\nCумму затрат на зарплаты в месяц: "
                + employeesList.sumSalary() + " руб."); // Посчитать сумму затрат на зарплаты в месяц.

        System.out.println("\nМинимальная зарплата у сотрудника:\n"
                + employeesList.findMinSalary().printFullnameSalary());
        //Поиск сотрудника с минимальной зарплатой

        System.out.println("\nМаксимальная зарплата у сотрудника:\n"
                + employeesList.findMaxSalary().printFullnameSalary());
        //Поиск сотрудника с максимальной зарплатой

        System.out.println("\nCреднее значение зарплат составляет: " + employeesList.averageSalaryEmloyees() + " руб."); // Подсчитать среднее значение зарплат

        System.out.println("\nСписок Ф. И. О. всех сотрудников:"); // Список Ф. И. О. всех сотрудников.
        employeesList.printAllEmployeesName();

        // повыженная сложность
        employeesList.indexSalaryEmloyees(10); // 1 Проиндексировал зарплату на 10%
        System.out.println("\nСписок сотрудников с зарплатами после индексации: ");
        employeesList.printAllEmployeesNameAndSalary();

        valueOtdel = 5;

        System.out.println("\nМинимальная зарплата в отделе " + valueOtdel
                + " у сотрудника:\n" + employeesList.findMinSalaryInOtdel(valueOtdel).printFullnameSalary());
        // 2.a Сотрудник с максимальной зарплатой

        System.out.println("\nМаскимальная зарплата в отделе " + valueOtdel
                + " у сотрудника:\n" + employeesList.findMaxSalaryInOtdel(valueOtdel).printFullnameSalary());
        // 2.b Сотрудник с максимальной зарплатой

        System.out.println("\nСумму затрат на зарплату по отделу "
                + valueOtdel + " равна " + employeesList.sumSalaryInOtdel(valueOtdel) + " руб.");
        // 2.c Сумму затрат на зарплату по отделу

        System.out.println("\nСредняя зарплата по отделу "
                + valueOtdel + " равна " + employeesList.averageSalaryEmloyeesInOtdel(valueOtdel) + " руб.");
        // 2.d Среднюю зарплату по отделу

        employeesList.indexSalaryEmloyeesInOtdel(valueOtdel, 7);
        // 2.e Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.

        employeesList.printEployeesOtdel(5);
        // 2.f Напечатать всех сотрудников отдела (все данные, кроме отдела)

        // 3. Получить в качестве параметра число и найти:
        employeesList.printSalaryLess(50000);
        // Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль)

        employeesList.printSalaryMoreOrEqual(50000);
        // Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль)

    }

}
