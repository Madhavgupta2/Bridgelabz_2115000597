import java.util.Scanner;

public class student2d {
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of students");
        int n=in.nextInt();
        int[][]marks=new int[n][3];
        double[]percentage=new double[n];
        char[]grade=new char[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter marks for student"+(i+1));
            System.out.println("Physics:");
            marks[i][0]=in.nextInt();
            while(marks[i][0]<0) {
                System.out.println("Invalid marks, enter positive value");
                marks[i][0]=in.nextInt();
            }
            System.out.println("Chemistry:");
            marks[i][1]=in.nextInt();
            while(marks[i][1]<0) {
                System.out.println("Invalid marks, enter positive value");
                marks[i][1]=in.nextInt();
            }
            System.out.println("Maths:");
            marks[i][2]=in.nextInt();
            while(marks[i][2]<0) {
                System.out.println("Invalid marks, enter positive value");
                marks[i][2]=in.nextInt();
            }
            percentage[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3.0;
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
            System.out.println(marks[i][0]+"\t"+marks[i][1]+"\t"+marks[i][2]+"\t"+percentage[i]+"\t"+grade[i]);
        }
    }
}
