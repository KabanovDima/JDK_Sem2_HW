package Sem_4_HW;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee (Employee employee){
        if(findEmpOnId(employee.getId()) == null){
            employees.add(employee);
        } else {
            System.out.println("Employee with " + employee.getId() + " already exist " +
                    "and you can't add new employee " + employee.getName());
        }


    }

    public List<Employee> findEmplOnExperience(int experience){
        List<Employee> foundEmployee = new ArrayList<>();
        for(Employee employee:employees){
            if(employee.getExperience() == experience){
                foundEmployee.add(employee);
            }
        }
        return foundEmployee;
    }

    public List<Employee> findEmpOnPhoneNumber(String phoneNumber){
        List<Employee> foundEmployee = new ArrayList<>();
        for(Employee employee:employees){
            if(employee.getPhoneNumber().equals(phoneNumber)){
                foundEmployee.add(employee);
            }
        }
        return foundEmployee;
    }

    public Employee findEmpOnId(int id){
        for(Employee employee : employees){
            if(employee.getId() == id){
               return employee;
            }
        }
        return null;
    }

}
