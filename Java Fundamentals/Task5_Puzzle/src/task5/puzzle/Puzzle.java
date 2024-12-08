package task5.puzzle;

import java.util.ArrayList;
import java.util.Random;

public class Puzzle {
	
    public ArrayList<Integer> getTenRolls() {
        Random rand = new Random();
        ArrayList<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rolls.add(rand.nextInt(20) + 1); // Generates number between 1 and 20
        }
        return rolls;
    }
	
	//////////////////////////////////////////////////////////////////
	
	public char getRandomLetter() {
		char[] letter= "abcdefghijklmnopqrstuvwxyz".toCharArray();;
		Random rand = new Random();
		char oneLetter = letter[rand.nextInt(26)];
		return oneLetter;
	}
	/////////////////////////////////////////////////////////////
	
	
    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(getRandomLetter());
        }
        return password.toString();
    }
    
    ////////////////////////////////////////////////////////////////////
    public String[] getNewPasswordSet(int num) {
    	String[] howManyPw= new String[num];
        for (int i = 0; i < num; i++) {
        	String pw=generatePassword();
        	howManyPw[i]=pw;
        }    	
    	return howManyPw;
		
	}
	

}
