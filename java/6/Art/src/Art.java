public abstract class Art {
    private String title;
    private String author;
    private String desc;

    public Art(String title, String author, String desc) {
        this.title = title;
        this.author = author;
        this.desc = desc;
    }
    abstract void viewArt();

    @Override
    public String toString() {
        return "Art [title=" + title + ", author=" + author + ", desc=" + desc +  "]";
    }





}
