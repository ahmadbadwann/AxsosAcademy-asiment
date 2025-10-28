public class Cafejava{
        public static void main(String[] args) {
            // APP VARIABLES
            // Lines of text that will appear in the app. 
            String generalGreeting = "Welcome to Cafe Java, ";
            String pendingMessage = ", your order will be ready shortly";
            String readyMessage = ", your order is ready";
            String displayTotalMessage = "Your total is $";
            
            // Menu variables (add yours below)
            double mochaPrice = 3.5;
            double arcofePrice= 3.3;
            double blooangelPrice=15.15;
            double nisscofe=3.3;
        
            // Customer name variables (add yours below)
            String customer1 = "Ahmad";
            String customer2 = "Sasha";
            String customer3 = "Caroolen";
            String customer4 = "bali aylesh";
        
            // Order completions (add yours below)
            boolean isReadyAhmad = false;
            boolean isreadySasha = true;
            boolean isreadyCaroolen = false;
            boolean isreadybali_aylesh = true;

            // APP INTERACTION SIMULATION (Add your code for the challenges below)
            // Example:
            System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, ahmad"
            // ** Your customer interaction print statements will go here ** //
            if (isreadySasha){
                System.out.println(customer2 + " " +readyMessage + " " + displayTotalMessage + arcofePrice);
            }
            else{
                System.out.println(customer2 + " " +pendingMessage + " " + displayTotalMessage + arcofePrice);
            }
            if (isreadyCaroolen){
                System.out.println(generalGreeting + " " +customer3+ " " + readyMessage +" "+ displayTotalMessage +" "+ blooangelPrice);
            }else{
                System.out.println(generalGreeting + " " +customer3+ " " +pendingMessage);
            }
        }
}
