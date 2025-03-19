import java.util.Scanner;

public class MidtermGrade
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your midterm score: ");
        int grade = scanner.nextInt();

        if(midterm(grade)== 'A')
        {
            System.out.println("Excellent, keep up the good work! ");
        }
        else if (midterm(grade) == 'B')
        {
            System.out.println("Good performance!");
        }
        else if (midterm(grade) == 'C')
        {
            System.out.println("You start to understand Java programming. Don't stop, keep learning!");
        }
        else if(midterm(grade) == 'D')
        {
            System.out.println("Seek for help. You are learning!");
        }
        else if (midterm(grade) == 'F')
        {
            System.out.println("Failing this one test doesn't mean that you are a failure. Please speak to your instructor. ");
        }
    

    }

    // your helper method here
    public static char midterm(int a)
    {
        if (a >= 90){
            return 'A';
        }
        else if (a >= 80 && a <=89){
            return 'B';
        }
        else if(a >= 70 && a <= 79){
            return 'C';
        }
        else if (a >= 60 && a <= 69){
            return 'D';
        }
        else if (a >= 0 && a <= 59){
            return 'F';
        }
        else {
            return 'I';
        }

    }
}
