
// Exer6.35: ComputerAssistedInstructionTest.java
// Test for class Multiply
import java.util.Scanner;

public class ComputerAssistedInstructionTest {
   public static void main(String[] args) {
      ComputerAssistedInstruction application = new ComputerAssistedInstruction();
      Scanner input = new Scanner(System.in);

      application.createQuestion(); // display the first question

      System.out.print("Enter your answer (-1 to exit): ");
      int guess = input.nextInt();

      while (guess != -1) {
         application.checkResponse(guess);

         System.out.print("Enter your answer (-1 to exit): ");
         guess = input.nextInt();
      }
      application.scoreSummary();
      input.close();
   }
}
