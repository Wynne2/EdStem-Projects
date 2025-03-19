import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Enter a positive or negative number: ");
            int num = scanner.nextInt();
            if(num >= 0)
            {
                pos = pos + 1;
            }
            else{
                neg = neg + 1;
            }
        }
        scanner.nextLine();
        System.out.print("Enter p for the positive count or n for the negative count: ");
        String whichOne = scanner.nextLine();
        if( whichOne.equals("p"))
        {
            System.out.println("Positive count is " + pos);
        }
        else if (whichOne.equals("n")){
            System.out.println("Negative count is " + neg);

        }
        //  System.out.println("Positive count is: " + ?);
        // System.out.println("Negative count is: " + ?);
    }
}

