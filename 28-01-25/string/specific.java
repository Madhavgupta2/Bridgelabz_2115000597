import java.util.Scanner;
public class specific{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.next().charAt(0);
        System.out.println(removeCharacter(str,ch));
    }
    public static String removeCharacter(String str, char ch){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
