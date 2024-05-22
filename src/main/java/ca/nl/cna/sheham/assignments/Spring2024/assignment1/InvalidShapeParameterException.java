package ca.nl.cna.sheham.assignments.Spring2024.assignment1;

public class InvalidShapeParameterException extends Exception {
    private static final String MSG = "Shape parameter is not valid!";

    public InvalidShapeParameterException() {
        super(MSG);
    }
}
