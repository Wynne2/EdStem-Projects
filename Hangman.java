import java.util.*;

public class Hangman {
    private static final String[] WORDS = {"java", "programming", "developer", "computer", "hangman", "keyboard"};
    private static final int MAX_ATTEMPTS = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String wordToGuess = WORDS[random.nextInt(WORDS.length)];  // Select a random word
        char[] guessedWord = new char[wordToGuess.length()];
        Arrays.fill(guessedWord, '_'); // Fill with underscores initially
        Set<Character> guessedLetters = new HashSet<>();

        int attemptsLeft = MAX_ATTEMPTS;
        boolean wordGuessed = false;

        System.out.println(" Welcome to Hangman! ");
        System.out.println("Guess the word: " + String.valueOf(guessedWord));

        while (attemptsLeft > 0 && !wordGuessed) {
            System.out.print("\nEnter a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (guessedLetters.contains(guess)) {
                System.out.println(" You already guessed '" + guess + "'. Try again!");
                continue;
            }

            guessedLetters.add(guess);

            if (wordToGuess.indexOf(guess) >= 0) {
                // Correct guess: update the guessedWord array
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guess) {
                        guessedWord[i] = guess;
                    }
                }
                System.out.println(" Correct! " + String.valueOf(guessedWord));
            } else {
                // Incorrect guess: reduce attempts
                attemptsLeft--;
                System.out.println(" Incorrect! You have " + attemptsLeft + " attempts left.");
            }

            // Check if the word is fully guessed
            if (String.valueOf(guessedWord).equals(wordToGuess)) {
                wordGuessed = true;
                System.out.println(" Congratulations! You guessed the word: " + wordToGuess);
            }
        }

        // If the player runs out of attempts
        if (!wordGuessed) {
            System.out.println(" Game Over! The correct word was: " + wordToGuess);
        }

        scanner.close();
    }
}
