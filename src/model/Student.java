package model;

import java.security.PublicKey;
import java.util.*;

public class Student extends Person implements Evaluation {

    // Student class can also have its own attributes
    private double average;

    // Student has a list of approved courses that he/she attends
    private final List<Course> courses = new ArrayList<>();

    // Student own list of approved list that he/she attends
    private final Map<String, Course> approvedCourses = new HashMap<>();



    public Student(String id, String name, String email, Date DOB) {
        super(id, name, email, DOB);
        average = 0.0;
    }

    public Student(String id, String name, String email, Date DOB, double average) {
        super(id, name, email, DOB);
        this.average = average;
    }

    @Override
    public String toString() {
        return String.format("{id: %d, name: %s, email: %s, DOB: %s,average GPA: %.2f}",
                super.getId(),
                super.getName(),
                super.getEmail(),
                super.getDOB(),
                this.average);
    }

    public double getAverage()
    {
        return average;
    }

    public void setAverage(double average){
        this.average = average;
    }

    public void enrollToCourse(Course course){
        //TODO

    }

    public void registerApprovedCourses(){
        //TODO

    }

    public boolean isCourseApproved(Course course){
        //TODO
        return false;
    }


    @Override
    public List<Course> getApprovedCourses() {
        //TODO


        return List.of();
    }
}


