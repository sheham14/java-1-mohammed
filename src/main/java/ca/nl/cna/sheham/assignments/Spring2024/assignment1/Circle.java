package ca.nl.cna.sheham.assignments.Spring2024.assignment1;

public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() throws InvalidShapeParameterException {
        if (radius < 0) {
            throw new InvalidShapeParameterException();
        } else { return Math.PI * Math.pow(radius, 2);}

    }

    @Override
    public String getDescription() {
        try {
            return String.format("Circle with radius %.2f has area of %.2f", radius, area());
        } catch (InvalidShapeParameterException e) {
            return "Invalid parameter";
        }
    }
}