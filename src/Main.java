import domen.Employee;
import domen.EmployeeUtils;
import domen.Supervisor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee tatiana = new Employee("Татьяна", "Веренич", "Валентиновна", "профессор", "+375-29-597-54-56", 3500, 34);
        Employee oleg = new Employee("Олег", "Веренич", "Олегович", "математик", "+375-29-555-77-88", 2800, 45);
        Employee irina = new Employee("Ирина", "Невдах", "Ивановна", "учитель физики", "+375-33-958-63-84", 2950, 38);
        Employee anna = new Employee("Анна","Самохина", "Юрьевна", "директор", "+375-44-899-95-75", 3900, 46);
        Employee alla = new Supervisor("Алла", "Свиридова", "Александровна", "Начальник", "+375-25-444-45-85", 6500, 48);

        Employee[] list = new Employee[]{tatiana, oleg, irina, anna, alla};
        //System.out.println(Arrays.toString(new Employee[]{tatiana, oleg, irina, anna}));
        System.out.println("------------------------------------------------------------");

        System.out.println(Arrays.toString(list));
//        EmployeeUtils.addMoneyToSalary(list);
        Employee.addMoneyToSalary(list, 5000, 45);

        System.out.println("\n--------------------зарплата добавлена----------------------");
        System.out.println(Arrays.toString(list));

        System.out.println("Средний возраст сотрудников: " + EmployeeUtils.averageAge(list));
        System.out.println("Средняя зарплата сотрудников: " + EmployeeUtils.averageSalary(list));
        int[] firstDate = {2023, 11, 21};
        int[] secondDate = {2022, 04, 12};

        System.out.println("Сравнение двух дат: " + Arrays.toString(firstDate) + " и " + Arrays.toString(secondDate) + " ");
        System.out.println("0 - равны, -1 - вторая старше, 1 - первая старше");
        System.out.println(Employee.comparing(firstDate, secondDate));

        Supervisor.addMoneyToSalary(list, 5000, 45);
        System.out.println("\n---------зарплата добавлена ещё раз, но только простым рабочим-----------");
        System.out.println(Arrays.toString(list));
    }
}