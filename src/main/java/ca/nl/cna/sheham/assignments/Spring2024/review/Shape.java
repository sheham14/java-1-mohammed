package ca.nl.cna.sheham.assignments.Spring2024.review;

import ca.nl.cna.sheham.assignments.Spring2024.assignment1.InvalidShapeParameterException;

public abstract class Shape {

    public abstract Double area() throws InvalidShapeParameterException;
    public abstract String getDescription();
}
