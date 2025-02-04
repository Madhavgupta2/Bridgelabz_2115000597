import java.util.*;

class Vehicle{
    private static double registrationFee=100.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber,String ownerName,String vehicleType){
        this.registrationNumber=registrationNumber;
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }

    public static void updateRegistrationFee(double newFee){
        registrationFee=newFee;
    }

    public void displayRegistrationDetails(){
        System.out.println("Registration Number:"+registrationNumber+" Owner:"+ownerName+" Vehicle Type:"+vehicleType+" Registration Fee:"+registrationFee);
    }
}

class VehicleRegistry{
    private List<Vehicle>vehicles;

    public VehicleRegistry(){
        vehicles=new ArrayList<>();
    }

    public void registerVehicle(Object obj){
        if(obj instanceof Vehicle){
            vehicles.add((Vehicle)obj);
        }
    }

    public void displayVehicles(){
        for(Vehicle v:vehicles){
            v.displayRegistrationDetails();
        }
    }
}

public class Main{
    public static void main(String[]args){
        Vehicle v1=new Vehicle("V001","John Doe","Car");
        Vehicle v2=new Vehicle("V002","Jane Smith","Motorcycle");
        Vehicle.updateRegistrationFee(150.0);
        VehicleRegistry registry=new VehicleRegistry();
        registry.registerVehicle(v1);
        registry.registerVehicle(v2);
        registry.displayVehicles();
    }
}
