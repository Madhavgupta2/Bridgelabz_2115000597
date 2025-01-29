import java.util.Scanner;
public class compare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(compareStrings(str1,str2));
    }
    public static int compareStrings(String str1,String str2){
        int minLength=Math.min(str1.length(),str2.length());
        for(int i=0;i<minLength;i++){
            if(str1.charAt(i)<str2.charAt(i)){
                return -1;
            }else if(str1.charAt(i)>str2.charAt(i)){
                return 1;
            }
        }
        if(str1.length()<str2.length()){
            return -1;
        }else if(str1.length()>str2.length()){
            return 1;
        }
        return 0;
    }
}
