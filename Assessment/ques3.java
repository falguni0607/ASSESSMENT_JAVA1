import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a list of numbers (enter -1 to finish):");

        int number;
        do {
            number = sc.nextInt();
            if (number != -1) {
                numbers.add(number);
            }
        } while (number != -1);

        

        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = sum / numbers.size();
        System.out.println("Average: " + average);
    }
}


