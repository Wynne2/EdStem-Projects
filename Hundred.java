import java.util.Scanner;
import java.lang.Math;
public class Hundred
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int closest = 0;
        int lDiff = 1000;

        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        lDiff = Math.abs(num - 100);
        closest = num;

        for (int i = 0; i < 9; i++){
            System.out.print("Enter a number: ");
            num = scanner.nextInt();

            if(Math.abs(num - 100) <= lDiff){
                lDiff = Math.abs(num - 100);
                closest = num;

            }
        }
        System.out.println("The number closest to 100 is " + closest + ".");
    }
}
