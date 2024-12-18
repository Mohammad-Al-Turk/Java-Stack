package task4.coffee.app;

import java.util.ArrayList;

public class Order {
    private String customerName;
    private ArrayList<Item> items;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void displayOrder() {
        System.out.println("Order for " + customerName + ":");
        double total= 0.0;
        for (Item item : items) {
            System.out.println(item.getName() + " -- $" + item.getPrice());
            total += item.getPrice();
        }
        System.out.println("total -- $" + total);
    }
}
