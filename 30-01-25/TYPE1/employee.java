class employee{
    String name;int id;double salary;// Attributes

    // Constructor to initialize employee details
    employee(String name,int id,double salary){
        this.name=name;this.id=id;this.salary=salary;
    }

    // Method to display employee details
    void display(){
        System.out.println("Employee Details:");
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
        System.out.println("Salary:"+salary);
    }

    // Main method to create and display employee details
    public static void main(String args[]){
        employee e=new employee("John",101,50000.00);// Creating object
        e.display();// Displaying details
    }
}
