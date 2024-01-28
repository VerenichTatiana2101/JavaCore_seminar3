package domen;

import java.io.IOException;

public class Employee {
    private String name;
    private String midName;
    private String surname;
    private String jobTitle;
    private String phoneNumber;
    private int salary;
    private int age;


    public Employee(String name, String midName, String surname, String jobTitle, String phoneNumber, int salary, int age) {
        this.name = name;
        this.midName = midName;
        this.surname = surname;
        this.jobTitle = jobTitle;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", midName='" + midName + '\'' +
                ", surname='" + surname + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

//    @Override
//    public String toString() {
//        return String.format("\nEmployee{" +
//                        "name='%s', midName='%s', surname='%s'" +
//                        ", job title='%s', phone number='%s'" +
//                        ", salary=%d, age=%d}'",
//                name, midName, surname, jobTitle, phoneNumber, salary, getAge());
//    }


    /**
     * Считает зарплату с надбвкой для метода addMoneyToSalary
     *
     * @param sum размр надбавки
     */
    public void allowance(int sum) {
        this.salary = salary + sum;
    }

    /**
     * Задача: Создать метод, повышающий
     * зарплату всем сотрудникам старше 45 лет на
     * 5000. Метод должен принимать в качестве
     * параметра массив сотрудников.
     * @param employees массив сотрудников
     * @param sumAllowance размер повышения
     * @param age возраст
     */
    public static void addMoneyToSalary(Employee[] employees, int sumAllowance, int age) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > age) {
                employees[i].allowance(sumAllowance);
            }
        }
    }

    /**
     * Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий
     * две даты, представленные в виде трёх чисел гггг-мм-дд, без использования
     * условного оператора
     *
     * @param dateFirst  первая дата
     * @param dateSecond вторая дата
     * @return результат в виде 0 - даты равны, -1 - dateSecond
     */
    public static int comparing(int[] dateFirst, int[] dateSecond) {
        int date1 = dateFirst[0] * 10000 + dateFirst[1] * 100 + dateFirst[2];
        int date2 = dateSecond[0] * 10000 + dateSecond[1] * 100 + dateSecond[2];
        int difference = date2 - date1;
        try {
            return difference / Math.abs(difference);
        } catch (Exception e) {
            return 0;
        }
    }


}
