package task3.alfred.bot;
import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello %s,nice to see you. How are you?",name);
    }
    
    public String dateAnnouncement() {
    	Date date = new Date();
        return "Current date: " + date.toString();
    }
    
    public String respondBeforeAlexis(String conversation) {
    	
    	String messege;
        switch(conversation) {
        
        case "Alexis":
        	messege = "I don't want to see you again";
        	break;
        	
        case "Alfred":
        	messege = "Here you go sir, I am at your service";
        	break;
        	
        default:
        	messege = "Hi, I don't know you from before, do I?";
        }
        return messege;
    }
}    
