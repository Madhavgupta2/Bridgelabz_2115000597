interface Refuelable{
    void refuel();
}
class Vehicle{
    String model;int maxSpeed;
    Vehicle(String model,int maxSpeed){
        this.model=model;this.maxSpeed=maxSpeed;
    }
    void displayInfo(){
        System.out.println("Model: "+model+", Max Speed: "+maxSpeed+" km/h");
    }
}
class ElectricVehicle extends Vehicle{
    int batteryCapacity;
    ElectricVehicle(String model,int maxSpeed,int batteryCapacity){
        super(model,maxSpeed);
        this.batteryCapacity=batteryCapacity;
    }
    void charge(){
        System.out.println("Charging... Battery Capacity: "+batteryCapacity+" kWh");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable{
    int fuelCapacity;
    PetrolVehicle(String model,int maxSpeed,int fuelCapacity){
        super(model,maxSpeed);
        this.fuelCapacity=fuelCapacity;
    }
    @Override
    public void refuel(){
        System.out.println("Refueling... Fuel Capacity: "+fuelCapacity+" liters");
    }
}
public class VehicleManagement{
    public static void main(String[] args){
        ElectricVehicle ev=new ElectricVehicle("Tesla Model 3",200,75);
        PetrolVehicle pv=new PetrolVehicle("Ford Mustang",250,60);
        ev.displayInfo();ev.charge();
        pv.displayInfo();pv.refuel();
    }
}
