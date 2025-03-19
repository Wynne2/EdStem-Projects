import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter triangle size: ");
        int size = scanner.nextInt();
        
        // Print the triangle
        printTriangle(size);
        
        scanner.close();
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {  // Loop from 1 to size
            for (int j = 0; j < i; j++) {  // Print 'i' stars in each row
                System.out.print("* ");
            }
            System.out.println();  // Move to the next line
        }
    }
}

