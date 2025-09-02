import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.println("Length: " + str.length());
        System.out.println("First: " + str.charAt(0));
        System.out.println("Last: " + str.charAt(str.length() - 1));

        boolean pal = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                pal = false;
                break;
            }
        }
        if (pal) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        String replacedStr = str.replace('a', 'o');
        System.out.println("Replaced string: " + replacedStr);
    }
}
