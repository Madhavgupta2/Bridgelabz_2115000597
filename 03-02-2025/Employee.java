public class Employee {
    static String companyName="capgemeni";
    static int Temployee=0;
    static void displayTotalEmployees(){
        System.out.println("total employee"+Temployee);

    } 
    String name;
    String designation;
    final int id;

    public Employee(String name,String designation,int id){
        this.name=name;
        this.designation=designation;
        this.id=id;
        Temployee++;
    }
    public void display(){
        if(this instanceof Employee){
            System.out.println("name"+name);
            System.out.println("id"+id);
            System.out.println("designation"+designation);

        }
    }
    public static void main(String[] args) {
        System.out.println("company name"+companyName);
        Employee e1=new Employee("karna","ml",23);
        Employee e2 =new Employee("vaibhav", "mern",234);
        e1.display();
        e2.display();
        Employee.displayTotalEmployees();

    }

}
