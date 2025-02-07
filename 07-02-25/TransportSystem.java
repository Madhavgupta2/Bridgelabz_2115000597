
class Vehicle {
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    void displayInfo(){
        System.out.println("Max Speed: "+maxSpeed+" km/h, Fuel Type: "+fuelType);
    }
}
class Car extends Vehicle {
    int seatCapacity;
    Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Vehicle Type: Car, Seat Capacity: "+seatCapacity);
    }
}
class Truck extends Vehicle {
    double loadCapacity;
    Truck(int maxSpeed,String fuelType,double loadCapacity){
        super(maxSpeed,fuelType);
        this.loadCapacity=loadCapacity;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Vehicle Type: Truck, Load Capacity: "+loadCapacity+" tons");
    }
}
class Motorcycle extends Vehicle {
    boolean hasSidecar;
    Motorcycle(int maxSpeed,String fuelType,boolean hasSidecar){
        super(maxSpeed,fuelType);
        this.hasSidecar=hasSidecar;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Vehicle Type: Motorcycle, Has Sidecar: "+(hasSidecar?"Yes":"No"));
    }
}
public class TransportSystem {
    public static void main(String[] args){
        Vehicle[] vehicles={new Car(200,"Petrol",5),new Truck(120,"Diesel",15),new Motorcycle(180,"Petrol",false)};
        System.out.println("=== Vehicle Details ===");
        for(Vehicle v:vehicles){
            v.displayInfo();
            System.out.println();
        }
    }
}
