import java.util.Scanner;
public class frequency{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Most Frequent Character: '"+mostFrequentCharacter(str)+"'");
    }
    public static char mostFrequentCharacter(String str){
        int[] freq=new int[256]; // Assuming ASCII characters
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        int maxFreq=0;
        char maxChar=' ';
        for(int i=0;i<256;i++){
            if(freq[i]>maxFreq){
                maxFreq=freq[i];
                maxChar=(char)i;
            }
        }
        return maxChar;
    }
}
