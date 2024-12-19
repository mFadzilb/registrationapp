package service;

import model.Course;
import model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService {

    // create map of student we need to store
    private final Map<String, Student> students = new HashMap<>();

    //subscribeStudent
    public void subscribeStudent(Student student){
        students.put(student.getId(), student);
        //How do we store the student to students course service
    }

    // findStudent
    public Student findStudent(String studentId){
        if(students.containsKey(studentId)){
            return students.get(studentId);
        }
        return null;
    }

    // enrollStudentToCourse
    public void enrollStudentToCourse(String studentId, Course course){
        if(students.containsKey(studentId)){    // Check that student
            students.get(studentId).enrollToCourse(course);  // Enroll student

        }
    }

    // Check if the student is subcribe
    public boolean isSubscribed(String studentId){
        // TODO
        return students.containsKey(studentId);

    }

    public void showSummary(){
        // TODO

    }

}
