public class car {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private final double rentalRatePerDay=50;
    car(String customerName,String carModel,int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
    }
    double totalCost(){
        return rentalDays*rentalRatePerDay;
    }
    void rentalDetails(){
        System.out.println("Customer:"+customerName+", Car Model:"+carModel+", Rental Days:"+rentalDays+", Total Cost:$"+totalCost());
    }
 
}
