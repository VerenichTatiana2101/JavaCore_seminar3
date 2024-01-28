package service;

import domen.Employee;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Organization {
    // ссылка на организацию
    private Organization organization;
    private List<Employee> branchEmployeesList;


//    public Branch(String nameOrganization, String addressOrganization, int countEmployeesIn,
//                  Employee manager, Organization organization) {
//        super(nameOrganization, addressOrganization, countEmployeesIn, manager);
//        this.organization = organization;
//        this.branchEmployeesList = new ArrayList<Employee>();
//    }

    public Branch(Organization organization, String branchName, int countEmployees) {
        super();
        this.organization = organization;
        branchEmployeesList = new ArrayList<Employee>();
        setNameOrganization(branchName);
        setCountEmployeesIn(countEmployees);
    }

    public List<Employee> getBranchEmployeesList() {
        return branchEmployeesList;
    }

    public void setBranchEmployeesList(List<Employee> branchEmployeesList) {
        this.branchEmployeesList = branchEmployeesList;
    }


    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }


    @Override
    public String toString() {
        return "Branch " + super.toString();
    }
}
