package model;

import java.util.List;

/**
 * An interface is an abstract class
 * that provides the method signatures of
 * what a class must implement
 * */

public interface Evaluation {

    //Q: How would u describe this method signature?
    //A: Abstract, getApprovedCourses is a method that returns a list of Courses

    List<Course> getApprovedCourses();


}
