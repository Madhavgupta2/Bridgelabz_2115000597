import java.util.Scanner;
public class factorial {
    public static void main(String[] args){ 
        Scanner in=new Scanner(System.in); 
        int number=in.nextInt(); 
        if(number>=0){ 
          int factorial=1; 
          while(number>0){ 
            factorial*=number; 
            number--; 
          } 
          System.out.println("Factorial: "+factorial); 
        }else{ 
          System.out.println("Please enter a positive integer."); 
        } 
      } 
    
}
