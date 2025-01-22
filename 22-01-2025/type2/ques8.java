import java.util.*;

public class ques8 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String name=input.next();
        String fromCity=input.next();
        String viaCity=input.next();
        String toCity=input.next();
        double distance1=input.nextDouble();
        double distance2=input.nextDouble();
        double time=input.nextDouble();
        double totalDistance=distance1+distance2;
        System.out.println("Name: "+name+", From: "+fromCity+", Via: "+viaCity+", To: "+toCity+". Distance: "+totalDistance+" miles, Time: "+time+" hours");
        input.close();
    }

    
}
