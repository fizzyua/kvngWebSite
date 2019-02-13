package app.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
public class Item {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String text;
    private String article;
    private Date create_time;

    @ElementCollection
    @CollectionTable(
            name="itemLinks",
            joinColumns=@JoinColumn(name="item_id")
    )
    private List<ItemLink> itemLinks;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private CustomUser user;



    public Item(String title, String text, String article, List<ItemLink> itemLinks) {
        this.title = title;
        this.text = text;
        this.article = article;
        this.itemLinks = itemLinks;
        this.create_time = Calendar.getInstance().getTime();
    }

    public Item(String title, String text, String article, List<ItemLink> itemLinks, CustomUser user) {
        this.title = title;
        this.text = text;
        this.article = article;
        this.itemLinks = itemLinks;
        this.user = user;
        this.create_time = Calendar.getInstance().getTime();
    }

    public Item() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public List<ItemLink> getItemLinks() {
        return itemLinks;
    }

    public void setItemLinks(List<ItemLink> itemLinks) {
        this.itemLinks = itemLinks;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", article='" + article + '\'' +
                ", create_time=" + create_time +
                ", itemLinks=" + itemLinks +
                ", user=" + user +
                '}';
    }
}
