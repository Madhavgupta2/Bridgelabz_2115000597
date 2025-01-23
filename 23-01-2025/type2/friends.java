import java.util.Scanner;

public class friends {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int amarage=in.nextInt();
        int akbarage=in.nextInt();
        int anthonyage=in.nextInt();
        int amarh=in.nextInt();
        int akbarh=in.nextInt();
        int anthonyh=in.nextInt();
        if(amarage>akbarage){
            if(amarage>anthonyage){
                System.out.println(amarage+"amarage");
            }
            else{
                System.out.println(anthonyage+"anthonyage");
            }
        }
        else{
            if(akbarage>anthonyage){
                System.out.println(akbarage+"akbarage");
            }
            else{
                System.out.println(anthonyage+"anthonyage");
            }
        }
        if(amarh>akbarh){
            if(amarh>anthonyh){
                System.out.println(amarh+"amar height");
            }
            else{
                System.out.println(anthonyh+"anthony height");
            }
        }
        else{
            if(akbarh>anthonyh){
                System.out.println(akbarh+"akbar height");
            }
            else{
                System.out.println(anthonyh+"anthony height");
            }
        }
          in.close();
    }
}
