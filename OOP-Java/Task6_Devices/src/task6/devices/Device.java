package task6.devices;

public class Device {
	 int battery;

	public Device() {
		this.battery=100;
		
	}
	
	
	public void displayBattery() {
        System.out.println("Battery remaining: " + this.battery + "%");
    }
	
}
