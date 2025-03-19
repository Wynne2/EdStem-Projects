import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = 0;
        double sum = 0;
        int count = 0;

        while ( num != -1){
            System.out.print("Enter number: ");
            num = scanner.nextInt();

            if (num != -1){
                sum = sum + num;
                count++;
            }
        }
        System.out.println("Your average is: " + (sum / count));
        // Accept input from user until they enter "x".
        // Then, return the running sum of the numbers entered.
    }
}

