package app.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ItemLink {
    @Column(name="path")
    private String path;

    public ItemLink(String path) {
        this.path = path;
    }

    public ItemLink() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "ItemLink{" +
                "path='" + path + '\'' +
                '}';
    }
}
