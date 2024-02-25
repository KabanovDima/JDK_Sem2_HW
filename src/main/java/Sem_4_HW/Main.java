package Sem_4_HW;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int findId = 3;
        int findExperience = 5;
        String findPhoneNumb = "+7912333444";

        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.addEmployee(new Employee(1, "+7912222333","Ivan Ivanov", 2));
        employeeDirectory.addEmployee(new Employee(2, "+7912333444","Petr Makarov", 5));
        employeeDirectory.addEmployee(new Employee(3, "+7912444555","Oleg Petrov", 12));
        employeeDirectory.addEmployee(new Employee(3, "+7912555666","Maksim Lavrentyev", 22));

        Employee foundEmployeeId = employeeDirectory.findEmpOnId(findId);
        if(foundEmployeeId != null){
            System.out.println("Employee with id# "+findId+" found: " + foundEmployeeId.getName());
        } else {
            System.out.println("Employeewith id# "+findId+" not found");
        }

        List<Employee> experienceEmpl = employeeDirectory.findEmplOnExperience(findExperience);
        System.out.println("Employee with " + findExperience + " years of experience:");
        for(Employee employee : experienceEmpl){
            System.out.println(employee.getName());
        }

        List<Employee> phoneNumberEmpl = employeeDirectory.findEmpOnPhoneNumber(findPhoneNumb);
        System.out.println("Employee with phone number " + findPhoneNumb + ":");
        for(Employee employee : phoneNumberEmpl){
            System.out.println(employee.getName());
        }
    }

}
