import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        if(palin()==true){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    public static String input(){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        return s;
    }
    public static boolean palin(){
        String a=input();
        int l=0;
        int r=a.length();
        while(l<=r){
            if(a.charAt(r)==a.charAt(l)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;

    }}