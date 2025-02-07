interface Worker{
    void performDuties();
}
class Person{
    String name;int id;
    Person(String name,int id){
        this.name=name;this.id=id;
    }
    void displayInfo(){
        System.out.println("Name: "+name+", ID: "+id);
    }
}
class Chef extends Person implements Worker{
    String specialty;
    Chef(String name,int id,String specialty){
        super(name,id);
        this.specialty=specialty;
    }
    @Override
    public void performDuties(){
        System.out.println("Duties: Cooking specialty dishes ("+specialty+")");
    }
}
class Waiter extends Person implements Worker{
    int tablesAssigned;
    Waiter(String name,int id,int tablesAssigned){
        super(name,id);
        this.tablesAssigned=tablesAssigned;
    }
    @Override
    public void performDuties(){
        System.out.println("Duties: Serving customers, Tables assigned: "+tablesAssigned);
    }
}
public class RestaurantSystem{
    public static void main(String[] args){
        Chef c=new Chef("Gordon",101,"Italian Cuisine");
        Waiter w=new Waiter("John",202,5);
        c.displayInfo();c.performDuties();
        w.displayInfo();w.performDuties();
    }
}
