package mastermind;

import java.io.Console;
import java.util.Random;

public class Main2 {
    
    public static void main(String[] args) {
        //Generate random 4 digit number between 1111 - 6666
        String generatedNumber = "";
        for (int i = 0 ; i < 4 ; i++) {
            Random random = new Random();
            generatedNumber += (random.nextInt(6) + 1);
        }
        //System.out.println(generatedNumber);
        
        //Using Console to prompt for input guess
        int attemptsLeft = 12;
        Console cons = System.console();
        while (attemptsLeft > 0) {
            String guess = cons.readLine("Please enter a 4 digit number with each digit being no more than 6: ");
            
            if (guess.equals(generatedNumber)) {
                System.out.println("Congratulations! You have read my mind!");
                break;
            } else if (guess.length() < 4){
                System.out.println("Invalid length of input. Please enter a 4 digit number");
            } else {
                int rightNumPos = 0;
                int rightNum = 0;
                boolean[] checker = {false, false, false, false};
                //Checking for invalid input
                for (int i = 0; i < guess.length(); i++){
                    if (!(guess.charAt(i) >= '1' && guess.charAt(i) <= '6')) {
                        System.out.println("Invalid input! Please try again!");
                        break;
                    } else {
                        //Checking digits and position first
                        if (guess.charAt(i) == generatedNumber.charAt(i)) {
                            rightNumPos++;
                            checker[i] = true;
                        } 
                    }
                } 
                //check if digits are in the wrong position
                for (int j = 0; j < guess.length(); j++) {
                    for (int x = 0; x < generatedNumber.length(); x++) {
                        if (checker[x] == true){
                            continue;
                        } else if (guess.charAt(j) == generatedNumber.charAt(x)) {
                            rightNum++;
                            checker[x] = true;
                        }
                    }
                    
                }

                attemptsLeft--;
                System.out.println("Guess       NumPos  Num");
                System.out.println(guess + "        " + rightNumPos + "        " + rightNum);
                System.out.printf("You have %d attempts left\n", attemptsLeft);
                rightNumPos = 0;
                rightNum = 0;
            }
                   
        }   
        System.out.println("The number was: " + generatedNumber);
        System.out.println("Bye bye!");      
    }
}        
