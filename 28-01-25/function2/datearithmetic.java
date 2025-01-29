import java.time.LocalDate;
import java.util.Scanner;

class datearithmetic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a date (YYYY-MM-DD):");
        LocalDate date = LocalDate.parse(in.next());
        
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        
        System.out.println("Modified Date: " + modifiedDate);
        in.close();
    }
}
