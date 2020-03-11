
//Exe6.35:ComputerAssistedInstruction.java
//generates single-digit multiplication problems
import java.security.SecureRandom;

public class ComputerAssistedInstruction {
   private static final SecureRandom randomNumbers = new SecureRandom();
   private int answer; // the correct answer
   private int totalQuestions = 0; // counting for total questions
   private int totalCorrect = 0;// counting for total correct
   private int totalWrong = 0;// counting for total wrong

   // prints a new question and stores the corresponding answer
   public void createQuestion() {
      // get two random numbers between 0 and 9
      int digit1 = randomNumbers.nextInt(10);
      int digit2 = randomNumbers.nextInt(10);

      answer = digit1 * digit2;
      System.out.printf("How much is %d times %d?\n", digit1, digit2);
   }

   // checks if the user answered correctly
   public void checkResponse(int guess) {
      int responseVariant = randomNumbers.nextInt(4);
      if (guess != answer) {
         System.out.println(wrongResponse(responseVariant));
         // adding a question to the counter to keep proper score
         totalQuestions++;
         // adding to the totalWrong counter
         totalWrong++;
      } else {
         System.out.println(rightResponse(responseVariant) + "\n");
         // adding a question to the counter to keep proper score
         totalQuestions++;
         // adding to the totalCorrect counter
         totalCorrect++;
         createQuestion();
      }
   }

   public String wrongResponse(int variant) {
      switch (variant) {
         case 0:
            return "No. Please try again.";
         case 1:
            return "Wrong. Try once more.";
         case 2:
            return "Don't give up!";
         case 3:
            return "No. Keep trying.";
         default:
            return "Something went wrong, much like your answer";
      }
   }

   public String rightResponse(int variant) {
      switch (variant) {
         case 0:
            return "Very good!";
         case 1:
            return "Excellent!";
         case 2:
            return "Nice work!";
         case 3:
            return "Keep up the good work!";
         default:
            return "Something went wrong, but your answer was right";
      }
   }

   public void scoreSummary() {
      System.out.println();
      System.out.println("There were " + totalQuestions + " questions total...");
      System.out.println("You answered " + totalCorrect + " questions correctly...");
      System.out.println("You gave " + totalWrong + " incorrect guesses...");
      System.out.print("Final Score: " + totalCorrect + "/" + totalQuestions);
      System.out.print(" : " + (totalCorrect * 100 / totalQuestions) + "%");
      System.out.println();
   }
}
