import java.util.Scanner;
public class sumofnumwhile { 
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in); 
        double total=0.0,number; 
        while(true){ 
          number=sc.nextDouble(); 
          if(number<=0){ 
            break; 
          } 
          total+=number; 
        } 
        System.out.println("Total: "+total); 
      } 
    }
