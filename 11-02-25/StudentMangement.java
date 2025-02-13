class Student {
    int rollNo;
    String name;
    int age;
    String grade;
    Student next;

    public Student(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentList {
    Student head;

    public StudentList() {
        head = null;
    }

    // Add a student record at the beginning
    public void addStudentAtBeginning(int rollNo, String name, int age, String grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    // Add a student record at the end
    public void addStudentAtEnd(int rollNo, String name, int age, String grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    // Add a student record at a specific position
    public void addStudentAtPosition(int rollNo, String name, int age, String grade, int position) {
        Student newStudent = new Student(rollNo, name, age, grade);
        if (position == 0) {
            newStudent.next = head;
            head = newStudent;
            return;
        }
        Student temp = head;
        for (int i = 0; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    // Delete a student record by Roll Number
    public void deleteStudentByRollNo(int rollNo) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Student with Roll Number " + rollNo + " not found");
            return;
        }
        temp.next = temp.next.next;
    }

    // Search for a student record by Roll Number
    public Student searchStudentByRollNo(int rollNo) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                return temp;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + rollNo + " not found");
        return null;
    }

    // Display all student records
    public void displayAllStudents() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNo + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    // Update a student's grade based on their Roll Number
    public void updateStudentGrade(int rollNo, String newGrade) {
        Student student = searchStudentByRollNo(rollNo);
        if (student != null) {
            student.grade = newGrade;
            System.out.println("Grade updated for Roll Number " + rollNo);
        }
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();

        studentList.addStudentAtEnd(1, "Alice", 20, "A");
        studentList.addStudentAtEnd(2, "Bob", 22, "B");
        studentList.addStudentAtBeginning(3, "Charlie", 21, "A");
        studentList.addStudentAtPosition(4, "David", 23, "B", 2);

        System.out.println("All Student Records:");
        studentList.displayAllStudents();

        System.out.println("\nSearching for student with Roll Number 2:");
        Student foundStudent = studentList.searchStudentByRollNo(2);
        if (foundStudent != null) {
            System.out.println("Found: " + foundStudent.name);
        }

        System.out.println("\nUpdating Grade of student with Roll Number 2:");
        studentList.updateStudentGrade(2, "A");

        System.out.println("\nAll Student Records after Grade Update:");
        studentList.displayAllStudents();

        System.out.println("\nDeleting student with Roll Number 3:");
        studentList.deleteStudentByRollNo(3);

        System.out.println("\nAll Student Records after Deletion:");
        studentList.displayAllStudents();
    }
}
