public class Test {
    public static void main(String[] args) {
        Itemss item1=new Itemss("mota",15.5);
        Itemss item2=new Itemss("latte",1.3);
        Itemss item3=new Itemss("coffy",3.3);
        Itemss item4=new Itemss("capitshino",2.2);
        
        Order order1=new Order("ahmad",item1.price,false,item1);
        Order order2=new Order("amr",item2.price,false,item2);
        Order order3=new Order("badwan",item3.price, true, item3);
        Order order4=new Order("kaled",item4.price,false,item4);
        System.out.println(order1);
        System.out.println(order1.total);
        order2.add_items(item1);
        order3.add_items(item4);
        order4.add_items(item2);
        order4.add_items(item2);
        order4.add_items(item2);
        order1.ready=true;
        order2.ready=true;
    }
}
