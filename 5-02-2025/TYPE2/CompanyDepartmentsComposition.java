import java.util.ArrayList;

class Company {
String name;
ArrayList<Department>departments;
Company(String name){
this.name=name;
departments=new ArrayList<>();
}
void addDepartment(String deptName){
Department department=new Department(deptName);
departments.add(department);
}
void displayCompany(){
System.out.println("Company:"+name);
for(Department department:departments){
department.displayDepartment();
}
}
}

class Department {
String name;
ArrayList<Employee>employees;
Department(String name){
this.name=name;
employees=new ArrayList<>();
}
void addEmployee(String empName){
Employee employee=new Employee(empName);
employees.add(employee);
}
void displayDepartment(){
System.out.println(" Department:"+name);
for(Employee employee:employees){
System.out.println("  Employee:"+employee.name);
}
}
}

class Employee {
String name;
Employee(String name){
this.name=name;
}
}

public class CompanyDepartmentsComposition {
public static void main(String[]args){
Company company=new Company("TechCorp");
company.addDepartment("IT");
company.addDepartment("HR");
company.departments.get(0).addEmployee("Alice");
company.departments.get(0).addEmployee("Bob");
company.departments.get(1).addEmployee("Charlie");
company.displayCompany();
company=null;
System.gc();
System.out.println("Company deleted along with its departments and employees.");
}
}
