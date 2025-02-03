public  class Person {
   
        private String name;
        private int age;
        Person(String name,int age){
            this.name=name;
            this.age=age;
        }
        Person(Person other){
            this.name=other.name;
            this.age=other.age;
        }
        void displayInfo(){
            System.out.println("Name:"+name+", Age:"+age);
        }
    }
    
    

