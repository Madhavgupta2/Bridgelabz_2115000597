import java.util.*;
class max3{
    public static void main(String[] args) {
      int n=input();
      int m=input();
      int l=input();
      System.out.println(max(n, m, l));  
    }
    public static int input(){
        Scanner in=new Scanner(System.in);
        int  n=in.nextInt();
          return n;
       

    }
    public static int max(int n,int m,int l){
        int p=Math.max(m,n);
        p=Math.max(p,l);
        return p;
    }
    
}