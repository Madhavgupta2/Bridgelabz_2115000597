import java.util.Scanner;
public class ques12 {
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        if(n>0){ 
          int sum=0, i=1; 
          while(i<=n){ 
            sum+=i; 
            i++; 
          } 
          int formulaSum = n*(n+1)/2; 
          System.out.println("Sum using while loop: "+sum); 
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
