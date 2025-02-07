 class employee {
    String name;
    int id;
    int salary;
    employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displayDetails(){
        System.out.println("name "+name+ " id"+id+" salary"+salary);
    }    
}
class manager extends employee {
    int teamsize;

    manager(String name,int id,int salary,int teamsize){
    super(name,id,salary); 
    this.teamsize=teamsize;  

}
void displayDetails(){
    super.displayDetails();
    System.out.println("role manager, team size"+teamsize);
}
}
class intern extends employee {
    int duaration;

    intern(String name,int id,int salary,int duaration){
    super(name,id,salary); 
    this.duaration=duaration;  

}
void displayDetails(){
    super.displayDetails();
    System.out.println("role intern, duaration"+duaration);
}
}
class devloper extends employee {
    String language;

    devloper(String name,int id,int salary,String language){
    super(name,id,salary); 
    this.language=language;  

}
void displayDetails(){
    super.displayDetails();
    System.out.println("developer, language"+language);
}
}


public class EmployeeSystem {
    public static void main(String[] args) {
       manager m=new manager("aditiya", 2, 500000, 40); 
       devloper d=new devloper("aditi", 24, 50000, "python"); 
       intern i=new intern("adi", 42, 5000, 4); 
       m.displayDetails();
       d.displayDetails();
       i.displayDetails();

    }
}
