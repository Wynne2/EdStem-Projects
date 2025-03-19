import java.util.Scanner;
 public class Frame {
     public static void main(String[] args) {
         Scanner stdin = new Scanner(System.in);
         System.out.print("Give me a word! ");
         String word = stdin.nextLine();

         for (int i = 0; i < (word.length() + 4); i++){
             System.out.print("*");
         }

         System.out.println();
         System.out.println("* "+word+" *");

         for (int i = 0; i < (word.length() + 4); i++){
             System.out.print("*");
         }
         System.out.println();
     }
 }
