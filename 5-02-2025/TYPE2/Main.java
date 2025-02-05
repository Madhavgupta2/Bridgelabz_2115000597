import java.util.*;

class Course {
    String courseName;
    List<Student> students = new ArrayList<>();
    
    Course(String courseName) {
        this.courseName = courseName;
    }
    
    void enrollStudent(Student student) {
        students.add(student);
    }
    
    void displayStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println(student.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();
    
    Student(String name) {
        this.name = name;
    }
    
    void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }
    
    void displayCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println(course.courseName);
        }
    }
}

class School {
    String schoolName;
    List<Student> students = new ArrayList<>();
    
    School(String schoolName) {
        this.schoolName = schoolName;
    }
    
    void addStudent(Student student) {
        students.add(student);
    }
}

public class Main {
    public static void main(String[] args) {
        School school = new School("ABC High School");
        Student student1 = new Student("John");
        Student student2 = new Student("Alice");
        school.addStudent(student1);
        school.addStudent(student2);
        
        Course course1 = new Course("Math");
        Course course2 = new Course("Science");
        
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);
        
        student1.displayCourses();
        student2.displayCourses();
        
        course1.displayStudents();
        course2.displayStudents();
    }
}

