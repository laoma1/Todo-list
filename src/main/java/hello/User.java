package hello;

public class User{
    private  Long id;
    private  String content;
    private String createdTime;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreatedTime() {
        return createdTime;
    }

public User(Long id, String content, String createdTime){
        this.id= id;
        this.content=content;
        this.createdTime=createdTime;
}

}