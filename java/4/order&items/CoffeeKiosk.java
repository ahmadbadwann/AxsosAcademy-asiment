import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Itemss> menu;
    private ArrayList<Order> orders;




    public void setMenu(Itemss item){
        menu.add(item);
    }
    public ArrayList<Itemss> getmenu(){
        return menu;
    }


    public void setOrder(Order order){
        orders.add(order);
    }
    public ArrayList<Order> getOrders(){
        return orders;
    }




    public  CoffeeKiosk(){
        menu = new ArrayList<Itemss>();
        orders = new ArrayList<Order>();
    }
    public void addnewItemss(String name,double price){
        Itemss item1 = new Itemss(name, price);
        item1.setIndex(menu.size());
        setMenu(item1);
    }


    public void displayMenu() {
        for (Itemss item : menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
            }
        }

    public void newOrder(){
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        Order order1=new Order(name);

        displayMenu();
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();

        while(!itemNumber.equals("q")){
            int index = Integer.parseInt(itemNumber);
            Itemss item = menu.get(index);
            order1.addItem(item);
            System.out.println("Enter another item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        orders.add(order1);
        order1.display();
    }
    public void addMenuItemByInput() {
    System.out.println("Enter item name:");
    String name = System.console().readLine();

    System.out.println("Enter item price:");
    double price = Double.parseDouble(System.console().readLine());

    addnewItemss(name, price);
}
}
