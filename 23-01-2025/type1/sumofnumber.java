import java.util.Scanner;
public class sumofnumber {
    public static void main(String[] args){ 
        Scanner in=new Scanner(System.in); 
        double total=0.0,number; 
        while((number=in.nextDouble())!=0){ 
          total+=number; 
        } 
        System.out.println("Total: "+total); 
      } 
    
}
