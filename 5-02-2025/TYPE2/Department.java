import java.util.*;

class Department {
    String departmentName;
    
    Department(String departmentName) {
        this.departmentName = departmentName;
    }
    
    void displayDepartment() {
        System.out.println("Department: " + departmentName);
    }
}

class Faculty {
    String name;
    
    Faculty(String name) {
        this.name = name;
    }
    
    void displayFaculty() {
        System.out.println("Faculty Member: " + name);
    }
}

class University {
    String universityName;
    List<Department> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();
    
    University(String universityName) {
        this.universityName = universityName;
    }
    
    void addDepartment(Department department) {
        departments.add(department);
    }
    
    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
    
    void deleteUniversity() {
        departments.clear(); // Composition: Deleting University deletes all Departments
        System.out.println("University and all its departments are deleted.");
    }
    
    void displayUniversityInfo() {
        System.out.println("University: " + universityName);
        System.out.println("Faculties:");
        for (Faculty faculty : faculties) {
            faculty.displayFaculty();
        }
        System.out.println("Departments:");
        for (Department department : departments) {
            department.displayDepartment();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        University university = new University("XYZ University");
        
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Physics");
        
        university.addDepartment(department1);
        university.addDepartment(department2);
        
        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Johnson");
        
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        
        university.displayUniversityInfo();
        
        university.deleteUniversity(); // Deleting university deletes its departments
        
        university.displayUniversityInfo(); // Should show no departments
    }
}
