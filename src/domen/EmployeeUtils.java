package domen;

/**
 * класс с рабочими мтодами для класса Employee
 */
public class EmployeeUtils {



    /**
     * Задача: Создать метод, повышающий
     * зарплату всем сотрудникам старше 45 лет на
     * 5000. Метод должен принимать в качестве
     * параметра массив сотрудников.
     * @param employees массив сотрудников
     */
    public static void addMoneyToSalary(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 45) {
                employees[i].allowance(5000);
            }
        }
    }

    /**
     * Написать методы (принимающие на вход массив сотрудников),
     * вычисляющие средний возраст
     * @param employees массив сотрудников
     * @return средний возраст
     */
    public static float averageAge(Employee[] employees){
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum+=employees[i].getAge();
        }
        return sum/employees.length;
    }

    /**
     * Написать методы (принимающие на вход массив сотрудников),
     * вычисляющие среднюю зарплату
     * @param employees массив сотрудников
     * @return среднюю зарплату
     */
    public static float averageSalary(Employee[] employees){
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum+=employees[i].getSalary();
        }
        return sum/employees.length;
    }


}
