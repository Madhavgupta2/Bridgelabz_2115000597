import java.util.*;
public class oddeven {
    public static void main(String[] args){ 
        Scanner in=new Scanner(System.in); 
        int number=in.nextInt(); 
        if(number>0){ 
          for(int i=1; i<=number; i++){ 
            if(i%2==0){ 
              System.out.println(i+" is even"); 
            }else{ 
              System.out.println(i+" is odd"); 
            } 
          } 
        }else{ 
          System.out.println("Please enter a positive integer."); 
        } 
      } 
    }
    
    

