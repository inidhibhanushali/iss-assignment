//this is a example of loop control & decision making
import java.util.Scanner;

public class CJava3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputS;

        // Decision making using if-else
        System.out.print("Enter a number = ");
        int number = sc.nextInt();
        isNoPosNegative(number);
        // Decision making using switch case
        int dayNo = 3;
        printDayOfWeek(dayNo);
        // Loop control using while loop
        System.out.print("Enter a word = ");
        inputS = sc.next();
        vowelConsonantCount(inputS);

        sc.close();//closing sc
    }
    public static void isNoPosNegative(int num){
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
    public static void printDayOfWeek(int dayNumber) {
        String day;

        switch (dayNumber) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day";
        }
        System.out.println("Day of the week: " + day);
    }
    public static void vowelConsonantCount(String input){
        int vowelCnt = 0;
        int consonantCnt = 0;

        int i = 0;
        while (i < input.length()) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowelCnt++;
                }
            }
            i++;
        }
        consonantCnt = input.length()-vowelCnt;
        System.out.println("Vowel count = " + vowelCnt);
        System.out.println("Consonant count = " + consonantCnt);
    }
}