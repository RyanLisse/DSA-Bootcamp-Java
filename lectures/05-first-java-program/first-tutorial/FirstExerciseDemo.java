import java.util.Scanner;

//1. Write a program to print whether a number is even or odd, also take
//        input from the user.
//        2. Take name as input and print a greeting message for that particular name.
//        3. Write a program to input principal, time, and rate (P, T, R) from the user and
//        find Simple Interest.
//        4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
//        (Use if conditions)
//        5. Take 2 numbers as input and print the largest number.
//        6. Input currency in rupees and output in USD.
//        7. To calculate Fibonacci Series up to n numbers.
//        8. To find out whether the given String is Palindrome or not.
//        9. To find Armstrong Number between two given number.
public class FirstExerciseDemo {
    public static void main(String[] args) {

//        isEven();
//        greetingMessage("Ryan");

        simpleInterest();
    }

    private static int simpleInterest(int p, int t, int r) {
        System.out.println("What is the principal");
     
    }

    private static void greetingMessage(String name) {
        System.out.println("Hi "+ name);
    }

    private static void isEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}