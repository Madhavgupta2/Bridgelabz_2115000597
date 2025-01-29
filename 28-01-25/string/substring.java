
import java.util.Scanner;
public class substring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String subStr=sc.nextLine();
        System.out.println(countOccurrences(str,subStr));
    }
    public static int countOccurrences(String str,String subStr){
        int count=0;
        int index=0;
        while((index=str.indexOf(subStr,index))!=-1){
            count++;
            index+=subStr.length();
        }
        return count;
    }
}
