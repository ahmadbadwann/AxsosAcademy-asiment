import java.util.ArrayList;
public class TestCafe {
    public static void main(String[] args){
        CafeUtil test = new CafeUtil();

        int sum=test.getStreakGoal();
        System.out.println(sum);

        double[] arr={3.33,4.44,5.55,2.22};
        double ssum = test.getOrderTotal(arr);
        System.out.println(ssum);

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("asall");
        menu.add("shawerma");
        menu.add("chekien");
        test.displayMenu(menu);

        ArrayList<String> custmers= new ArrayList<String>();
        custmers.add("sam");
        custmers.add("jameeeeeeel");
        custmers.add("badwan");
        test.addCustomer(custmers);
    }
}
