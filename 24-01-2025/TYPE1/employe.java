import java.util.Scanner;
public class employe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary of employee" + (i + 1));
            salary[i] = in.nextDouble();
            System.out.println("Enter years of service of employee" + (i + 1));
            years[i] = in.nextDouble();
            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input, enter again");
                i--;
            }
        }
        for (int i = 0; i < 10; i++) {
            bonus[i] = (years[i] > 5) ? (salary[i] * 0.05) : (salary[i] * 0.02);
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Total bonus payout:" + totalBonus);
        System.out.println("Total old salary:" + totalOldSalary);
        System.out.println("Total new salary:" + totalNewSalary);
    }
}
