public class spring {
    public static void main(String[] args){ 
        int month=Integer.parseInt(args[0]),day=Integer.parseInt(args[1]); 
        if((month==3&&day>=20)||(month==6&&day<=20)||(month>3&&month<6)){ 
          System.out.println("Its a Spring Season"); 
        }else{ 
          System.out.println("Not a Spring Season"); 
        } 
      } 
    
    
}
