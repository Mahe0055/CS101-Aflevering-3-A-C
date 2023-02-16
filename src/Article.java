public class Article {
    private String title;
    private String author;


    //Constructor
    public Article(String title, String author) {
        this.title = title;
        this.author = author;
    }

   @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

