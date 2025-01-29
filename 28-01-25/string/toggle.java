import java.util.Scanner;
public class toggle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(toggleCase(str));
    }
    public static String toggleCase(String str){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            }else{
                result.append(Character.toUpperCase(c));
            }
        }
        return result.toString();
    }
}
