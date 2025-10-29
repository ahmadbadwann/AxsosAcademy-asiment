import java.util.Random;
public class PuzzleJava {
    Random randMachine = new Random();
    public int[] getTenRolls(){
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=randMachine.nextInt(20);
        }
        return arr;
    }
        public char getRandomLetter() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int randomIndex = randMachine.nextInt(26);
        return alphabet[randomIndex];
    }

    public String generatePassword(){
    String password = "";
    for(int i = 0; i < 8; i++){
            password += getRandomLetter();
        }
        return password;
}
    public String[] getNewPasswordSet(int length) {
        String[] passwordSet = new String[length];
        for (int i = 0; i < length; i++) {
            passwordSet[i] = generatePassword();
        }
        return passwordSet;
    }
}

