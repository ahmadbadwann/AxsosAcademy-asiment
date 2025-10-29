public class test {
    public static void main(String[] args) {
        PuzzleJava test= new PuzzleJava();

        int[] x=test.getTenRolls();
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }

        char f=test.getRandomLetter();
        System.out.println(f);

        String h=test.generatePassword();
        System.out.println(h);

        String[] n=test.getNewPasswordSet(10);
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
    }
}
