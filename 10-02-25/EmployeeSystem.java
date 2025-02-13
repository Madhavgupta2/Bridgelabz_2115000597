abstract class Employee{
    private int employeeId;
    private String name;
    private double baseSalary;
    public abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("Employee ID: "+employeeId+" Name: "+name+" Salary: "+calculateSalary());
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary=baseSalary;
    }
}

class FullTimeEmployee extends Employee{
    public double calculateSalary(){
        return getBaseSalary();
    }
}

class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;
    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }
    public int getHoursWorked(){
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked=hoursWorked;
    }
    public double getHourlyRate(){
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate=hourlyRate;
    }
}

interface Department{
    void assignDepartment(String department);
    String getDepartmentDetails();
}

class ITDepartment implements Department{
    private String department;
    public void assignDepartment(String department){
        this.department=department;
    }
    public String getDepartmentDetails(){
        return department;
    }
}

public class EmaployeeSystem{
    public static void main(String[] args){
        Employee e1=new FullTimeEmployee();
        e1.setEmployeeId(101);
        e1.setName("John");
        e1.setBaseSalary(5000);
        Employee e2=new PartTimeEmployee();
        e2.setEmployeeId(102);
        e2.setName("Alice");
        PartTimeEmployee pte=(PartTimeEmployee)e2;
        pte.setHoursWorked(80);
        pte.setHourlyRate(20);
        Employee[] employees={e1,e2};
        for(Employee e:employees){
            e.displayDetails();
        }
        Department dept=new ITDepartment();
        dept.assignDepartment("IT");
        System.out.println("Department: "+dept.getDepartmentDetails());
    }
}
