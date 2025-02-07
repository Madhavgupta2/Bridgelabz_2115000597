class animal{
    String name;
    int age;
    animal(int age,String name){
        this.age=age;
        this.name=name;}
    void makeSound(){
        System.out.println("ANIMAL MAKE SOUND");

    }
    
    void display(){
        System.out.println("name"+name+"age"+age);
    }
}
    class dog extends animal {
        dog(int age,String name){
            super(age,name);
        }
    
    
        void makeSound(){
            System.out.println("dog bark");
        }

    }
    class cat extends animal {
        cat(int age,String name){
            super(age,name);
        }
        void makeSound(){
            System.out.println("cat meow");
        }

    }
    class bird extends animal {
        bird(int age,String name){
            super(age,name);
        }
        void makeSound(){
            System.out.println("brid sing");
        }

    }
    public class animalSound {
    public static void main(String[] args) {
        // animal a=new animal();
        cat c=new cat(4,"buddy");
        dog d=new dog(5,"tuffy");
        bird b=new bird(6,"joro");
        // a.makeSound();
        b.makeSound();
        b.display();
        
        c.makeSound();
        c.display();
        d.makeSound();
        d.display();

    }}

