package task2.barista.assignment;

public class TestOrder {
    public static void main(String[] args) {
        Item item1 = new Item("drip coffee", 1.50);
        Item item2 = new Item("capuccino", 3.50);

        Order order1 = new Order();
        order1.addItem(item1);
        order1.addItem(item2);
        order1.setReady(true);

        Order order2 = new Order("Cindhuri");
        order2.addItem(new Item("latte", 2.75));
        order2.addItem(new Item("espresso", 3.00));

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());

        System.out.println("Order 1 Total: $" + order1.getOrderTotal());
        System.out.println("Order 2 Total: $" + order2.getOrderTotal());

        order1.display();
        order2.display();
    }
}
