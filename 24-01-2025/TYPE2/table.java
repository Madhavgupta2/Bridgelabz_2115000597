import java.util.Scanner;

public class table {
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number for multiplication table");
        int number=in.nextInt();
        int[]table=new int[10];
        for(int i=1;i<=10;i++) {
            table[i-1]=number*i;
        }
        for(int i=0;i<table.length;i++) {
            System.out.println(number+" * "+(i+1)+" = "+table[i]);
        }
}
}