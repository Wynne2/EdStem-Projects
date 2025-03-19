import java.util.Scanner;

public class SecondLargest
{
	public static void main(String[] args)
	{
         Scanner stdin = new Scanner(System.in); 
		 int N = 0;
		 int L = 0;
		 int secLargest = 0;
		 int i = 0;

		 while (N != -1)
		 {
			 System.out.print("Enter your number: "); 
			 N = stdin.nextInt();

			 if((N != -1) && (N > L))
			 {
				 secLargest = L;
				 L = N;
			 }
			 else if ((N < L) && (N > secLargest))
			 {
				 secLargest = N;
			 }
			 i++;
			
		 }
		 if (i > 2)
		 {
			 System.out.println("The second largest number is " + secLargest + ".");
		
		 }
		 else
		 {
			 System.out.println("Invalid");
		 }
	}
}
