package task2.barista.assignment;

import java.util.ArrayList;

public class Order {
	
	private String name;
	private boolean ready;
	private ArrayList<Item> items = new ArrayList<Item>();

	
	public Order() {		
	}

	public Order(String name) {
		this.name=name;
	}
	
	
	
	public void addItem(Item Item) {
		 items.add(Item);
	}
	
	
	public String getStatusMessage() {
		if (this.ready==true) {
			return "Your order is ready";
		}
		else {
			return "Thank you for waiting. Your order will be ready soon";
		}		
	}
	
	
	public double getOrderTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
	
	
	public void display() {
        System.out.print("Customer Name: " + name + "\n");
        for (Item item : items) {
            System.out.print(item.getName() + " - $" + item.getPrice() + "\n");
        }
        System.out.print("Total: $" + getOrderTotal() + "\n");
    }
	
	

	
	public boolean isReady() {
		return ready;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	

}
