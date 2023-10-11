package ca.nl.cna.sheham.examples;

public class Employee {
    private String firstName;

    private String lastName;

    private Double annualSalary;

    public Employee(String firstName, String lastName, Double annualSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(Double annualSalary) {
        if (annualSalary >= 0) {
            this.annualSalary = annualSalary;
        }
    }

   public void giveRaise(Double percent){
       annualSalary += annualSalary * percent;
   }
}
