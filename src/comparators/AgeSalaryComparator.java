package comparators;

import domen.Employee;

import java.util.Comparator;

public class AgeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o, Employee o2) {
        if (o2.getAge() == o.getAge()) {
            if (o2.getSalary() == o.getSalary()) {
                return 0;
            }
            if (o2.getSalary() < o.getSalary()) {
                return -1;
            }
            return 1;
        }
        if (o2.getAge() > o.getAge()) {
            return 1;
        }
        return -1;
    }
}
