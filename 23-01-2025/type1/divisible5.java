import java.util.Scanner;

class divisible5{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n%5==0){
            System.out.println("the number "+n+" divisible by 5");
        }
        else{
            System.out.println("the number is not divisible by 5");
        }
    }
}