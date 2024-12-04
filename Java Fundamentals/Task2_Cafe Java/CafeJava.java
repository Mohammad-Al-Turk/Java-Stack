public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.0; // Added dripCoffee price
        double lattePrice = 4.0; // Added latte price
        double cappuccinoPrice = 4.5; // Added cappuccino price

        // Customer name variables (add yours below)
        String customer1 = "Shatha";
        String customer2 = "Ahmad"; // Added customer Ahmad
        String customer3 = "Sali"; // Added customer Sali
        String customer4 = "Adam"; // Added customer Adam

        // Order completions (add yours below)
        boolean isReadyOrder1 = false; // Shatha's order status
        boolean isReadyOrder2 = true; // Ahmad's order status (assuming ready)
        boolean isReadyOrder3 = true; // Sali's order status (assuming ready)
        boolean isReadyOrder4 = false; // Adam's order status

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Shatha"
        // ** Your customer interaction print statements will go here ** //



        

        System.out.println(customer3 + (isReadyOrder3 ? readyMessage : pendingMessage));
        
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage + ". " + displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        
        double saliTotal = 2 * lattePrice;
        System.out.println(customer3 + "'s total is " + displayTotalMessage + saliTotal);
        isReadyOrder3 = false; 
        System.out.println(customer3 + (isReadyOrder3 ? readyMessage : pendingMessage));
        
        double adamTotal = lattePrice; 
        System.out.println(customer4 + "'s updated total is " + displayTotalMessage + adamTotal);
        
  
        dripCoffeePrice = 2.5; 
        cappuccinoPrice = 5.0; 
        isReadyOrder2 = false; 
        isReadyOrder4 = true; 
        

        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage + ". " + displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(customer4 + (isReadyOrder4 ? readyMessage : pendingMessage) + ". " + displayTotalMessage + adamTotal);

    }
}