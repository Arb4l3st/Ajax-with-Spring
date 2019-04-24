package arbalest.time.beans;

public class JSON {

    private final long id;
    private final String content;

    public JSON(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
