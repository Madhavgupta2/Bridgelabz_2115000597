abstract class Vehicle{
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    public abstract double calculateFare(double distance);
    public void getVehicleDetails(){
        System.out.println("Vehicle ID: "+vehicleId+" Driver: "+driverName+" Rate per km: "+ratePerKm);
    }
    public String getVehicleId(){
        return vehicleId;
    }
    public void setVehicleId(String vehicleId){
        this.vehicleId=vehicleId;
    }
    public String getDriverName(){
        return driverName;
    }
    public void setDriverName(String driverName){
        this.driverName=driverName;
    }
    public double getRatePerKm(){
        return ratePerKm;
    }
    public void setRatePerKm(double ratePerKm){
        this.ratePerKm=ratePerKm;
    }
}

class Car extends Vehicle{
    public double calculateFare(double distance){
        return distance * getRatePerKm() + 50;  // Base fare of 50 for Car
    }
}

class Bike extends Vehicle{
    public double calculateFare(double distance){
        return distance * getRatePerKm() + 20;  // Base fare of 20 for Bike
    }
}

class Auto extends Vehicle{
    public double calculateFare(double distance){
        return distance * getRatePerKm() + 30;  // Base fare of 30 for Auto
    }
}

interface GPS{
    String getCurrentLocation();
    void updateLocation(String location);
}

class CarGPS implements GPS{
    private String currentLocation;
    public String getCurrentLocation(){
        return currentLocation;
    }
    public void updateLocation(String location){
        currentLocation=location;
        System.out.println("Car location updated to: "+location);
    }
}

class BikeGPS implements GPS{
    private String currentLocation;
    public String getCurrentLocation(){
        return currentLocation;
    }
    public void updateLocation(String location){
        currentLocation=location;
        System.out.println("Bike location updated to: "+location);
    }
}

class AutoGPS implements GPS{
    private String currentLocation;
    public String getCurrentLocation(){
        return currentLocation;
    }
    public void updateLocation(String location){
        currentLocation=location;
        System.out.println("Auto location updated to: "+location);
    }
}

public class RideHailingApplication{
    public static void main(String[] args){
        Vehicle v1=new Car();
        v1.setVehicleId("C123");
        v1.setDriverName("John");
        v1.setRatePerKm(10);
        
        Vehicle v2=new Bike();
        v2.setVehicleId("B456");
        v2.setDriverName("Alice");
        v2.setRatePerKm(5);
        
        Vehicle v3=new Auto();
        v3.setVehicleId("A789");
        v3.setDriverName("Bob");
        v3.setRatePerKm(7);
        
        GPS gps1=new CarGPS();
        GPS gps2=new BikeGPS();
        GPS gps3=new AutoGPS();
        
        Vehicle[] vehicles={v1,v2,v3};
        for(Vehicle v:vehicles){
            v.getVehicleDetails();
            double fare=v.calculateFare(10);  // Assume distance is 10 km
            System.out.println("Fare for 10 km: "+fare);
        }
        
        gps1.updateLocation("City Center");
        gps2.updateLocation("Downtown");
        gps3.updateLocation("Airport");
    }
}
