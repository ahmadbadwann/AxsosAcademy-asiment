public class Painting extends Art {
    public Painting (String title, String author,String  desc) {
        super(title,  author,  desc);
    }

    void viewArt(){
        System.out.println("painting");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}