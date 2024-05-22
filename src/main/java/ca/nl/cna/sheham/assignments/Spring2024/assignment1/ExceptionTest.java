package ca.nl.cna.sheham.assignments.Spring2024.assignment1;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            throw new ExceptionC("ExceptionC occurred!");
        } catch (ExceptionA e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
