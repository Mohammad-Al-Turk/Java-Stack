package task5.puzzle;

import java.util.Arrays;

public class PuzzleTestMain {
    public static void main(String[] args) {
    	Puzzle generator = new Puzzle();

  
        System.out.println("Random Rolls: " + generator.getTenRolls());

        
        System.out.println("Random Letter: " + generator.getRandomLetter());

        
        System.out.println("Generated Password: " + generator.generatePassword());

        
        String[] passwordSet = generator.getNewPasswordSet(5);
        System.out.println("Password Set: " + Arrays.toString(passwordSet));

    }
}
