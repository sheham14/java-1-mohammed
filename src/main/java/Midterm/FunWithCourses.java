package Midterm;

/**
 * CP2280 Midterm
 *
 * Application for making sure your Course class is built according to the instructions
 *
 * Note: if this class doesn't find your Course class then you may want to create a new
 * version of this class inside your project and copy and paste all this text in to ensure you are in the
 * right project.
 *
 */
public class FunWithCourses {

    public static void main(String[] args) {
        System.out.println("Fun with Courses on a Midterm! Yay!");

        //TODO you need to create a Course class. Make sure it's in the same project and default package

        //Create a simple course
        Course course = new Course("Java 1", "CP2280", 4);
        Course negativeCourse = new Course ("Java 2", "CP2300", -2);
        Course zeroCourse = new Course ("Java 3", "CP2400", 0);

        //Print out a course's information
        printCourseInfo(course);
        printCourseInfo(negativeCourse);
        printCourseInfo(zeroCourse);



        //TODO consider writing more tests to make sure you met all the requirements

    }

    public static void printCourseInfo(Course course){
        System.out.printf("Course name: %s, number: %s, credit total: %d", course.getName(), course.getNumber(), course.getCredits());
    }


}
