public class TestOrders {
    public static void main(String[] args) {
        // إنشاء عناصر
        Itemss item1 = new Itemss("drip coffee", 1.50);
        Itemss item2 = new Itemss("cappuccino", 3.50);
        Itemss item3 = new Itemss("latte", 4.00);
        Itemss item4 = new Itemss("mocha", 4.50);


        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Cindhuri");
        Order order4 = new Order("Jimmy");
        Order order5 = new Order("Noah");

        order1.addItem(item1);
        order1.addItem(item4);

        order3.addItem(item2);
        order3.addItem(item3);

        order3.setReady(true);
        order1.setReady(false);

        System.out.println(order1.getStatusMessage());
        System.out.println(order3.getStatusMessage());

        System.out.println(order3.getOrderTotal());

        order1.display();
        order3.display();
    }
}
