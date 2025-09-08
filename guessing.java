import java.util.Scanner;
public class guessing {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        String secretWord = "java";
        String guess = ""; 
        int guessCount = 0;
        int guessLimit = 3;
        boolean outOfGuesses = false; 

        while (!guess.equals(secretWord) && !outOfGuesses) {

            if(guessCount < guessLimit){
                System.out.print("Enter your guess: ");
                guess = keyboardInput.nextLine();
                guessCount++;
            } else {
                outOfGuesses = true;
                break;
            }

        }
        if(outOfGuesses) {
            System.out.println("You lose!");
        } else {
        System.out.println("You guessed it!");
    }
}
}