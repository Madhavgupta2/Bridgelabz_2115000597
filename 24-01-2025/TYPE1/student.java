import java.util.Scanner;

public class student {
        public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of students");
        int n=in.nextInt();
        int[]physics=new int[n];
        int[]chemistry=new int[n];
        int[]maths=new int[n];
        double[]percentage=new double[n];
        char[]grade=new char[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter marks for student"+(i+1));
            System.out.println("Physics:");
            physics[i]=in.nextInt();
            while(physics[i]<0) {
                System.out.println("Invalid marks, enter positive value");
                physics[i]=in.nextInt();
            }
            System.out.println("Chemistry:");
            chemistry[i]=in.nextInt();
            while(chemistry[i]<0) {
                System.out.println("Invalid marks, enter positive value");
                chemistry[i]=in.nextInt();
            }
            System.out.println("Maths:");
            maths[i]=in.nextInt();
            while(maths[i]<0) {
                System.out.println("Invalid marks, enter positive value");
                maths[i]=in.nextInt();
            }
            percentage[i]=(physics[i]+chemistry[i]+maths[i])/3.0;
            if(percentage[i]>=90)
                grade[i]='A';
            else if(percentage[i]>=80)
                grade[i]='B';
            else if(percentage[i]>=70)
                grade[i]='C';
            else if(percentage[i]>=60)
                grade[i]='D';
            else
                grade[i]='F';
        }
        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for(int i=0;i<n;i++) {
            System.out.println(physics[i]+"\t"+chemistry[i]+"\t"+maths[i]+"\t"+percentage[i]+"\t"+grade[i]);
        }
    }

}
