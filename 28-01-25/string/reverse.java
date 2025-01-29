import java.util.Scanner;
class reverse{
    static String reverseString(String str) {
        String reverse="";
        for (int i=str.length()-1;i>=0;i--) {
            reverse+=str.charAt(i);
        }
      a  return reverse;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=in.nextLine();
        System.out.println("Reversed String: "+reverseString(input));
        in.close();
    }
}
