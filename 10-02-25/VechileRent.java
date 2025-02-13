abstract class Vehicle{
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public abstract double calculateRentalCost(int days);
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber=vehicleNumber;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public double getRentalRate(){
        return rentalRate;
    }
    public void setRentalRate(double rentalRate){
        this.rentalRate=rentalRate;
    }
}

class Car extends Vehicle{
    public double calculateRentalCost(int days){
        return getRentalRate()*days;
    }
}

class Bike extends Vehicle{
    public double calculateRentalCost(int days){
        return getRentalRate()*days;
    }
}

class Truck extends Vehicle{
    public double calculateRentalCost(int days){
        return getRentalRate()*days;
    }
}

interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}

class CarInsurance implements Insurable{
    public double calculateInsurance(){
        return 0.05;  // 5% of rental cost
    }
    public String getInsuranceDetails(){
        return "Car Insurance: 5% of rental cost";
    }
}

class BikeInsurance implements Insurable{
    public double calculateInsurance(){
        return 0.03;  // 3% of rental cost
    }
    public String getInsuranceDetails(){
        return "Bike Insurance: 3% of rental cost";
    }
}

class TruckInsurance implements Insurable{
    public double calculateInsurance(){
        return 0.07;  // 7% of rental cost
    }
    public String getInsuranceDetails(){
        return "Truck Insurance: 7% of rental cost";
    }
}

public class VehicleRent{
    public static void main(String[] args){
        Vehicle v1=new Car();
        v1.setVehicleNumber("A123");
        v1.setType("Car");
        v1.setRentalRate(500);
        Vehicle v2=new Bike();
        v2.setVehicleNumber("B456");
        v2.setType("Bike");
        v2.setRentalRate(150);
        Vehicle v3=new Truck();
        v3.setVehicleNumber("C789");
        v3.setType("Truck");
        v3.setRentalRate(1000);
        
        Insurable carInsurance=new CarInsurance();
        Insurable bikeInsurance=new BikeInsurance();
        Insurable truckInsurance=new TruckInsurance();
        
        Vehicle[] vehicles={v1,v2,v3};
        for(Vehicle v:vehicles){
            int rentalDays=5;
            double rentalCost=v.calculateRentalCost(rentalDays);
            Insurable insurance=null;
            if(v instanceof Car) insurance=carInsurance;
            if(v instanceof Bike) insurance=bikeInsurance;
            if(v instanceof Truck) insurance=truckInsurance;
            
            double insuranceCost=rentalCost*insurance.calculateInsurance();
            double totalCost=rentalCost + insuranceCost;
            System.out.println("Vehicle: "+v.getType()+" Rental Cost: "+rentalCost+" Insurance Cost: "+insuranceCost+" Total Cost: "+totalCost);
            System.out.println(insurance.getInsuranceDetails());
        }
    }
}
