package Midterm;

import java.util.Objects;

/**
 * A class for rectangles. Contains 2 parameters length ands width.
 */
public class Rectangle {
    public Double length;
    public Double width;

    /**
     * Constructor for the rectangle class.
     * @param length Length of the rectangle. Must be greater than zero.
     * @param width Width of the rectangle. Must be greater than zero.
     */
    public Rectangle(Double length, Double width) {
        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be greater then zero!");
        }
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be greater then zero!");
        }
    }

    /**
     * Gets the length of the rectangle and returns it.
     * @return length
     */
    public Double getLength() {
        return length;
    }

    /**
     * Sets the length of the rectangle to a new length.
     * @param length The new length
     */
    public void setLength(Double length) {
        this.length = length;
    }

    /**
     * Gets the width of the rectangle and returns it.
     * @return width
     */
    public Double getWidth() {
        return width;
    }

    /**
     * Sets the length of the rectangle to a new width.
     * @param width The new width
     */
    public void setWidth(Double width) {
        this.width = width;
    }

    /**
     * Multiplies the length and the width of the rectangle to get its area
     * @return area
     */
    public Double area() {
        return length * width;
    }

    /**
     * Doubles the sum of the length and width to get perimeter of the rectangle
     * @return perimeter
     */
    public Double perimeter() {
        return 2 * (length + width);
    }

    /**
     * Checks if the length and width are equal
     * @return true if the length and width are equal
     */
    public boolean isSquare() {
        return Objects.equals(length, width);
    }
}
