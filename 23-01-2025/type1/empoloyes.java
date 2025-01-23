import java.util.Scanner;
public class empoloyes {
     
        public static void main(String[] args){ 
          Scanner in=new Scanner(System.in); 
          double salary=in.nextDouble(); 
          int yearsOfService=in.nextInt(); 
          if(yearsOfService>5){ 
            double bonus=salary*0.05; 
            System.out.println("Bonus: "+bonus); 
          }else{ 
            System.out.println("No bonus for you."); 
          } 
        } 
      
}
