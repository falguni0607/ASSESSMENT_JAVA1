import java.util.*;

public class ques1 {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        number = sc.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        }

        else if (number < 0) {
            System.out.println("The number is negative.");
        }

        else {
            System.out.println("The number is zero.");
        }
    }

}
