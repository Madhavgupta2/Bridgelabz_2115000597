import java.util.*;

class Course {
    String courseName;
    Professor professor;
    List<Student> students = new ArrayList<>();
    
    Course(String courseName) {
        this.courseName = courseName;
    }
    
    void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCourse(this);
        System.out.println("Professor " + professor.name + " assigned to " + courseName);
    }
    
    void enrollStudent(Student student) {
        students.add(student);
        student.addCourse(this);
        System.out.println(student.name + " enrolled in " + courseName);
    }
    
    void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: " + professor.name);
        }
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println(student.name);
        }
    }
}

class Professor {
    String name;
    List<Course> courses = new ArrayList<>();
    
    Professor(String name) {
        this.name = name;
    }
    
    void addCourse(Course course) {
        courses.add(course);
    }
    
    void displayCourses() {
        System.out.println("Professor " + name + " teaches:");
        for (Course course : courses) {
            System.out.println(course.courseName);
        }
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();
    
    Student(String name) {
        this.name = name;
    }
    
    void enrollCourse(Course course) {
        course.enrollStudent(this);
    }
    
    void addCourse(Course course) {
        courses.add(course);
    }
    
    void displayCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println(course.courseName);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");
        
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");
        
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);
        
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
        
        student1.displayCourses();
        student2.displayCourses();
        
        professor1.displayCourses();
        professor2.displayCourses();
        
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
