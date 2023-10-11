package ca.nl.cna.sheham.assignments;

import java.util.Scanner;


public class FunWithEmployees {

    public static void main(String[] args) {
        System.out.println("Lets have fun with employees!");

        Scanner input = new Scanner(System.in);

        double salaryTotal = 0;
        int employeeCounter = 0;
        final int NUM_EMPLOYEES = 3;

        while(employeeCounter < NUM_EMPLOYEES) {

            System.out.println("Enter first name: ");
            String firstName = input.nextLine();

            System.out.println("Enter last name: ");
            String lastName = input.nextLine();

            System.out.println("Enter annual salary: ");
            Double annualSalary = input.nextDouble();
            input.nextLine();

            Employee employee = new Employee(firstName, lastName, annualSalary);
            employee.giveRaise(0.08);

            System.out.printf("First name: %s\n",
                    employee.getFirstName());

            System.out.printf("Last Name: %s\n",
                    employee.getLastName());

            System.out.printf("Annual Salary: %f\n",
                    employee.getAnnualSalary());


            salaryTotal += employee.getAnnualSalary();
            employeeCounter++;
        }

        System.out.printf("Average salary: %f\n", salaryTotal/employeeCounter);
    }
}
