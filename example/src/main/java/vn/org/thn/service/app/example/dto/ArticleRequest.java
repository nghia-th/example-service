package vn.org.thn.service.app.example.dto;

public class ArticleRequest {

    private String title;
    private String content;
    /** No auth/security layer in {@code base} (removed on purpose - see IBase's javadoc), so the
     * acting user is simply supplied by the caller for the audit columns. */
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
