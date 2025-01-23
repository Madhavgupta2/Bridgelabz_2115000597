package type2;
import java.util.*;
public class rewriteleap {
    public static void main(String[] args) {
        Scanner an=new Scanner(System.in);
        int year=an.nextInt();

        if (year>=1582&&((year%400==0)||(year%4==0&&year%100!=0))) {
            System.out.println(year+" is a Leap Year.");
        } else {
            System.out.println(year+"is not a Leap Year.");
        }
    }

    
}
