package ca.nl.cna.sheham.assignments.Spring2024.assignment1;

public class ConstructorFailureTest {
    public static void main(String[] args) {
        try {
            SomeClass someObject = new SomeClass();
            System.out.println("Object created successfully!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

