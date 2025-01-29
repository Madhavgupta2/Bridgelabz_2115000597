import java.util.Scanner;
import java.util.Arrays;
public class Anagram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(areAnagrams(str1,str2));
    }
    public static boolean areAnagrams(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
