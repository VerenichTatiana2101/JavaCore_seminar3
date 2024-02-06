package comparators;

import domen.Employee;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        // Сравниваем сотрудников по возрасту.
        // Возвращаем отрицательное число, если emp1 младше emp2,
        // положительное, если emp1 старше emp2, и 0, если они одного возраста.

        return Integer.compare(emp1.getAge(), emp2.getAge());
    }
}

