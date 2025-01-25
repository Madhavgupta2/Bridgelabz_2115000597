import java.util.Scanner;

public class bmimukti {
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of persons");
        int n=in.nextInt();
        double[][]personData=new double[n][3];
        String[]weightStatus=new String[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter weight of person"+(i+1));
            personData[i][0]=in.nextDouble();
            while(personData[i][0]<=0) {
                System.out.println("Invalid weight, enter positive value");
                personData[i][0]=in.nextDouble();
            }
            System.out.println("Enter height of person"+(i+1));
            personData[i][1]=in.nextDouble();
            while(personData[i][1]<=0) {
                System.out.println("Invalid height, enter positive value");
                personData[i][1]=in.nextDouble();
            }
            personData[i][2]=personData[i][0]/(personData[i][1]*personData[i][1]);
            if(personData[i][2]<18.5)
                weightStatus[i]="Underweight";
            else if(personData[i][2]<24.9)
                weightStatus[i]="Normal";
            else if(personData[i][2]<29.9)
                weightStatus[i]="Overweight";
            else
                weightStatus[i]="Obese";
        }
        System.out.println("Height\tWeight\tBMI\tStatus");
        for(int i=0;i<n;i++) {
            System.out.println(personData[i][1]+"\t"+personData[i][0]+"\t"+personData[i][2]+"\t"+weightStatus[i]);
        }
    }
}
