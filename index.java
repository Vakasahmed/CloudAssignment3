package Assignment3;

import java.util.Scanner;

public class index {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String str = scan.nextLine();
        char ch = scan.next().charAt(0);
        boolean isMatch = false;
        String resultStr = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ch) {
                isMatch = true;
            }
            if (isMatch) {
                resultStr += str.charAt(i + 1);
            }
        }
        if (!isMatch) {
            if (ch == str.charAt(str.length() - 1)) {
                System.out.println("This is the last letter in the sentence.");
            } else {
                System.out.println("The letter is not exist in the sentence.");

            }
        } else {
            System.out.println(resultStr);
        }
    }
}