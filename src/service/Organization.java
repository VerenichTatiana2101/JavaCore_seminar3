package service;

import domen.Employee;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    private String nameOrganization;
    private String addressOrganization;
    private int countEmployeesIn;
    private List<Department> departmentList;
    private Employee manager;

    public Organization(String nameOrganization, String addressOrganization,
                        int countEmployeesIn, Employee manager) {
        this.nameOrganization = nameOrganization;
        this.addressOrganization = addressOrganization;
        this.countEmployeesIn = countEmployeesIn;
        this.manager = manager;
        departmentList = new ArrayList<Department>();
    }

    public Organization() {
        departmentList = new ArrayList<Department>();
    }

    //он публичны значит есть и у Branch
    public void addDepartment(Department department){
        departmentList.add(department);
    }


    public String getNameOrganization() {
        return nameOrganization;
    }

    public void setNameOrganization(String nameOrganization) {
        this.nameOrganization = nameOrganization;
    }

    public String getAddressOrganization() {
        return addressOrganization;
    }

    public void setAddressOrganization(String addressOrganization) {
        this.addressOrganization = addressOrganization;
    }

    public int getCountEmployeesIn() {
        return countEmployeesIn;
    }

    public void setCountEmployeesIn(int countEmployeesIn) {
        this.countEmployeesIn = countEmployeesIn;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "nameOrganization='" + nameOrganization + '\'' +
                ", addressOrganization='" + addressOrganization + '\'' +
                ", countEmployeesIn=" + countEmployeesIn +
                ", departmentList=" + departmentList +
                ", manager=" + manager +
                '}';
    }
}
