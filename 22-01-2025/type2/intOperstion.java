import java.util.*;
public class intOperstion {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=a+b*c;
        int e=a*b+c;
        int f=c+a/b;
        int g=a%b+c;
        System.out.println("The results of Int Operations are "+d+", "+e+", "+f+", and "+g);
        input.close();
    }


}
