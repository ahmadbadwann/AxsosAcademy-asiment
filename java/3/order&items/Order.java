import java.util.ArrayList;
public class Order {
    String name;
    double total;
    boolean ready;
    ArrayList<Itemss> items=new ArrayList<>();

    public Order(String name,double total,boolean ready,Itemss items){
        this.name=name;
        this.total=total;
        this.ready=ready;
        this.items.add(items);
    }
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Itemss>();
    }
    public Order() {
    this.name = "Guest";
    this.items = new ArrayList<Itemss>();
}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Itemss> getItems() {
        return items;
    }

    public void setItems(ArrayList<Itemss> items) {
        this.items = items;
    }


    public void addItem(Itemss item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (this.ready) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double total = 0;
        for (Itemss item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        for (Itemss item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
}
