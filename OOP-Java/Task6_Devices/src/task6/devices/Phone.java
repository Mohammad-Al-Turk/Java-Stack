package task6.devices;

public class Phone extends Device{
	
	public Phone() {
		super();
			}

public void makeCall() {
	if(this.battery - 5 > 0) {
		this.battery -= 5;
		System.out.println("You made a call. Battery remaining: " + this.battery + "%");
	}

	else {
        System.out.println("Battery too low to make a call.");
    }	
}




public void playGame() {
    if (this.battery < 25) {
        System.out.println("Battery too low to play a game.");
    } else {
        this.battery -= 20;
        System.out.println("You play a game. Battery remaining: " + this.battery + "%");
        if (this.battery < 10) {
            System.out.println("Battery critical: Please charge your device!");
        }
    }
}


public void charge() {
    if (this.battery + 50 <= 100) {
    	this.battery += 50;
    	System.out.println("You charged your phone. Battery remaining: " + this.battery + "%");
    }
    
    else {
    	this.battery=100;
    	System.out.println("You charged your phone. Battery remaining: " + this.battery + "%");
    	
    }
}




}



