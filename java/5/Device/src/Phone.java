public class Phone extends Device{
    public void makeCall() {
        if (battery >= 5) {
            battery -= 5;
            System.out.println("You make a call.");
        } else {
            System.out.println("Battery too low to make a call!");
        }
        displayBattery();
        checkCritical();
    }


    public void playGame() {
        if (battery < 25) {
            System.out.println("Battery too low to play a game! Please charge first.");
        } else {
            battery -= 20;
            System.out.println("You play a game.");
            displayBattery();
            checkCritical();
        }
    }


    public void charge() {
        battery += 50;
        if (battery > 100) {
            battery = 100;
        }
        System.out.println("Charging the phone...");
        displayBattery();
    }


    private void checkCritical() {
        if (battery < 10) {
            System.out.println("Battery critical! Please charge soon!");
        }
    }
}
