import java.util.*;

public class pounds_to_kg {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double weight=input.nextDouble();
        double weightInKg=weight/2.2;
        System.out.println("The weight of the person in pound is "+weight+" and in kg is "+weightInKg);
        input.close();
    }
}
