package domen;

public class Supervisor extends Employee {

    public Supervisor(String name, String midName, String surname, String jobTitle, String phoneNumber, int salary, int age) {
        super(name, midName, surname, jobTitle, phoneNumber, salary, age);
    }

    public Supervisor() {
    }


    public static void addMoneyToSalary(Employee[] employees, int sumAllowance, int age) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > age && !(employees[i] instanceof Supervisor)) {
                employees[i].allowance(sumAllowance);
            }
        }
    }


    @Override
    public String toString() {
        return "\nSupervisor{" +
                "name='" + getName() + '\'' +
                ", midName='" + getMidName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", salary=" + getSalary() +
                ", age=" + getAge() +
                '}';
    }
}
