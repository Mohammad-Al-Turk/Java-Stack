package task3.alfred.bot;

public class AlfredTest {
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // Make some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String alexisTest = alfredBot.respondBeforeAlexis("Alexis");
        String alfredTest = alfredBot.respondBeforeAlexis("Alfred");
        String notRelevantTest = alfredBot.respondBeforeAlexis("turk");
        
        // Print the greetings to test.
        System.out.println(testGreeting);
        
//         Uncomment these one at a time as you implement each method.
         System.out.println(testGuestGreeting);
         System.out.println(testDateAnnouncement);
         System.out.println(alexisTest);
         System.out.println(alfredTest);
         System.out.println(notRelevantTest);
    }
}