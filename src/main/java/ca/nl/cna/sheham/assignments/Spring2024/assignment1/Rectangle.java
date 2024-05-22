package ca.nl.cna.sheham.assignments.Spring2024.assignment1;

public class Rectangle extends Shape {
    private Double length;
    private Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public Double area() throws InvalidShapeParameterException {
        if (length < 0 || width < 0) {
            throw new InvalidShapeParameterException();
        }
        return length * width;
    }

    @Override
    public String getDescription() {
        try {
            return String.format("This rectangle has a length of %.1f and width of %.1f and has an area of %.1f", length, width, area());
        } catch (InvalidShapeParameterException e) {
            return "Invalid parameter";
        }
    }
}
