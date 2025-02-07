class Person{
    String name;int age;
    Person(String name,int age){
        this.name=name;this.age=age;
    }
    void displayInfo(){
        System.out.println("Name: "+name+", Age: "+age);
    }
}
class Teacher extends Person{
    String subject;
    Teacher(String name,int age,String subject){
        super(name,age);
        this.subject=subject;
    }
    void displayRole(){
        System.out.println("Role: Teacher, Subject: "+subject);
    }
}
class Student extends Person{
    int grade;
    Student(String name,int age,int grade){
        super(name,age);
        this.grade=grade;
    }
    void displayRole(){
        System.out.println("Role: Student, Grade: "+grade);
    }
}
class Staff extends Person{
    String position;
    Staff(String name,int age,String position){
        super(name,age);
        this.position=position;
    }
    void displayRole(){
        System.out.println("Role: Staff, Position: "+position);
    }
}
public class SchoolSystem{
    public static void main(String[] args){
        Teacher t=new Teacher("Alice",35,"Mathematics");
        Student s=new Student("Bob",16,10);
        Staff st=new Staff("Charlie",40,"Librarian");
        t.displayInfo();t.displayRole();
        s.displayInfo();s.displayRole();
        st.displayInfo();st.displayRole();
    }
}

