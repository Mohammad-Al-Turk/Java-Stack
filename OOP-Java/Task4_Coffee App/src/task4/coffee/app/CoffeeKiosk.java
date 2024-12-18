package task4.coffee.app;



import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // Constructor
    public CoffeeKiosk() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    // Add Menu Item
    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        newItem.setIndex(menu.size()); // تحديد الفهرس بناءً على حجم القائمة
        menu.add(newItem);
    }

    public void displayMenu() {
        for (Item item : menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
        }
    }

    public void newOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter customer name for new order:");
        String customerName = scanner.nextLine();

        Order newOrder = new Order(customerName);

        displayMenu();
        System.out.println("Please enter a menu item index or q to quit:");

        String input = scanner.nextLine();

        while (!input.equals("q")) {
            try {
                int itemIndex = Integer.parseInt(input);
                if (itemIndex >= 0 && itemIndex < menu.size()) {
                    Item selectedItem = menu.get(itemIndex);
                    newOrder.addItem(selectedItem);
                    System.out.println(selectedItem.getName() + " added to your order.");
                } else {
                    System.out.println("Invalid index. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'q' to quit.");
            }

            System.out.println("Please enter a menu item index or q to quit:");
            input = scanner.nextLine();
        }

        newOrder.displayOrder();
        orders.add(newOrder);
    }

    public void addMenuItemByInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the item:");
        String name = scanner.nextLine();

        System.out.println("Enter the price of the item:");
        double price = scanner.nextDouble();

        addMenuItem(name, price);
        System.out.println(name + " has been added to the menu.");
    }
}
