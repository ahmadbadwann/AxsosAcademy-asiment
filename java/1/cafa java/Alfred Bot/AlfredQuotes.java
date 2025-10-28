
import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE

        return "Hello, "+name +" Bast. Lovely to see you.";
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently Wed "+date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.indexOf("Alexis") != -1){
            return ("خليها تنفعك");
        }else if (conversation.indexOf("Alfred") != -1) {
            return ("At your service. As you wish, naturally");
        }else{
            return ("Right. And with that I shall retire.");
        }
    }
    
    // NINJA BONUS
    // See the specs to overload the guestGreeting method
    public String guestGreeting(String name, String dayPeriod) {
        return ("Good " + dayPeriod + ","+ name + " %s. Lovely to see you.");
    }
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
    public String angryAlfred(String text) {
        return "SIR!!! " + text.toUpperCase() + "!!!";
    }
}
