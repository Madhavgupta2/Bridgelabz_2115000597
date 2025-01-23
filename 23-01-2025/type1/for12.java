import java.util.Scanner;
public class for12 {
    public static void main(String[] args){ 
        Scanner in=new Scanner(System.in); 
        int n=in.nextInt(); 
        if(n>0){ 
          int sum=0; 
          for(int i=1; i<=n; i++){ 
            sum+=i; 
          } 
          int formulaSum = n*(n+1)/2; 
          System.out.println("Sum using for loop: "+sum); 
          System.out.println("Sum using formula: "+formulaSum); 
          if(sum == formulaSum){ 
            System.out.println("Both results are correct!"); 
          }else{ 
            System.out.println("Results do not match!"); 
          } 
        }else{ 
          System.out.println("The number is not a natural number"); 
        } 
      } 
    }
    
    
    
    
    
    
    
    

