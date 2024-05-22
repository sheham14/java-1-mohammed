package ca.nl.cna.sheham.assignments.Spring2024.assignment1;

public class RethrowingExceptions {
    public static void someMethod2() throws Exception {
        throw new Exception("Exception in someMethod2");
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
