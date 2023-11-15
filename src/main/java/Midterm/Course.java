package Midterm;

/**
 * A course class that contains three parameters which are the name, number, and credits.
 */
public class Course {

    public String name;
    public String number;
    public int credits;

    /**
     * Constructor for the course class
     *
     * @param name    The name of the course. Stored as a string
     * @param number  The number of the course. Stored as a string. Example: "CP2200"
     * @param credits The number of credits the course offers. Must be a positive number
     */
    public Course(String name, String number, int credits) {
        this.name = name;
        this.number = number;
        if (credits > 0) {
            this.credits = credits;
        } else {
            throw new IllegalArgumentException("Credits must be a positive number!");
        }
    }

    /**
     * Gets the name of a course and returns it
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the course to a new name
     *
     * @param name The new course name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the number of the course and returns it.
     *
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the number of the course to a new number
     *
     * @param number The new course number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Gets the course credits and returns it
     *
     * @return credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Sets the course credits to a new value. Must be a positive number
     *
     * @param credits The new credits
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }
}

