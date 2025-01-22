import java.util.*;

public class athlete {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double side1=input.nextDouble();
        double side2=input.nextDouble();
        double side3=input.nextDouble();
        double perimeter=side1+side2+side3;
        double rounds=5000/perimeter;
        System.out.println("The total number of rounds the athlete will run is "+(int)Math.ceil(rounds)+" to complete 5 km");
        input.close();
    }

}
