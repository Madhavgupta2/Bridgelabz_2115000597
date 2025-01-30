// import java.util.Scanner;
// public class RemoveDuplicates{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String input=sc.nextLine();
//         System.out.println(removeDuplicates(input));
//     }
//     public static String removeDuplicates(String str){
//         StringBuilder result=new StringBuilder();
//         for(int i=0;i<str.length();i++){
//             if(result.indexOf(String.valueOf(str.charAt(i)))==-1){
//                 result.append(str.charAt(i));
//             }
//         }
//         return result.toString();
//     }}

import java.util.*;

public class removeduplicates {
    public static String removeDuplicates(String str) {
        boolean seen[]=new boolean[256];
        char chars[]=str.toCharArray();
        int index=0;

        for(int i=0;i<chars.length;i++){
            if (!seen[chars[i]]) {
                seen[chars[i]]=true;
                chars[index++]=chars[i];
            }
        }
        return new String(chars,0,index);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a string");
        String input=in.nextLine();
        in.close();
        System.out.println("String after removing duplicates"+removeDuplicates(input));
    }
}