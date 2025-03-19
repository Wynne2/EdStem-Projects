import java.util.Scanner;

public class Lowest {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int low = 1000000;
		for(int i=1; i<6; i++)
		{
			System.out.print("Enter a number: ");
			int num = stdin.nextInt();
			System.out.println("Your number is " + num);
			if( num < low)
			{
				low = num;
			}
		}
		System.out.println("The lowest number you entered is " + low);
		// nextInt() read an integer from the user
		
		
	}
}
