package ca.nl.cna.sheham.assignments.Fall2023.examples;

public class Car {

    private String make;

    private String model;

    private int year;

    private double value;

    public Car(String make, String model, int year, double value) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.value = value;
    }

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getValue() {
        return value;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setValue(double value) {
        this.value = value;
    }


}


