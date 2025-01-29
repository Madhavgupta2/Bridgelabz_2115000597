import java.util.Scanner;
public class RemoveDuplicates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(removeDuplicates(input));
    }
    public static String removeDuplicates(String str){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(result.indexOf(String.valueOf(str.charAt(i)))==-1){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
