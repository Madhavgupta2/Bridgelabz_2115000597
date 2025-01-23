import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double w=in.nextDouble();
        double h=in.nextDouble();
        double bmi=w/(h*h);
        if (bmi>18.5 && bmi<24.9){
            System.out.println("normal");
        }
        else if(bmi>25 && bmi<39.9){
            System.out.println("overweight");

        }
        else if(bmi>=40){
            System.out.println("obese");
        }
        else{
            System.out.println("underweight");
        }
        in.close();
    }
}
