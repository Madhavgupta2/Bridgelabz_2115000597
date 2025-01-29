import java.util.Scanner;
class vowels {
    static String processString(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        return "Vowels: " + vowels + "\nConsonants: " + consonants;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.nextLine();
        System.out.println(processString(input));
        in.close();
    }
}
