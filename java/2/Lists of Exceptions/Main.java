import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {

        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("15");
        myList.add("hello world");
        myList.add(48);

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Successfully casted value: " + castedValue);

            } catch (ClassCastException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Value causing error: " + myList.get(i));
            }
        }
    }
}