import domen.Employee;
import domen.EmployeeUtils;
import domen.Supervisor;
import service.Branch;
import service.Department;
import service.Organization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee tatiana = new Employee("Татьяна", "Веренич", "профессор", "+375-29-597-54-56", 3500, 34);
        Employee oleg = new Employee("Олег", "Веренич", "математик", "+375-29-555-77-88", 2800, 45);
        Employee irina = new Employee("Ирина", "Невдах", "учитель физики", "+375-33-958-63-84", 2950, 38);
        Employee anna = new Employee("Анна","Самохина", "директор", "+375-44-899-95-75", 3900, 46);
        Employee alla = new Supervisor("Алла", "Свиридова", "Начальник", "+375-25-444-45-85", 6500, 48);

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

        Organization organization = new Organization();
        organization.setNameOrganization("организация 1");

        Branch branch1 = new Branch(organization, "branch1", 20);
        Branch branch2 = new Branch(organization, "branch2", 5);
        Branch branch3 = new Branch(organization, "branch3", 4);

        Department dep = new Department("департамент1");

        //добавили сотруднику департамент
        oleg.setEmpDep(dep);

        //вывести количество сотрудников в департаменте
        branch1.addDepartment(dep);  //метод родителя публичный, мы можем им пользоваться
        int count = 0;
        for (Employee e: branch1.getBranchEmployeesList()){
            if(e.getEmpDep() == dep) count++;
        }
        System.out.println(count);
        System.out.println(branch1.getBranchEmployeesList());


//        System.out.println(organization);
//        System.out.println(branch1);
    }
}