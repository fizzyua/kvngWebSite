package app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Member {
    @Id
    @GeneratedValue
    private long id;
    private String fio;
    private String activity;
    private String pathToFoto;
    private String description;
    private Date create_time;

    public Member() {
    }

    public Member(String fio, String activity, String pathToFoto, String description) {
        this.fio = fio;
        this.activity = activity;
        this.pathToFoto = pathToFoto;
        this.description = description;
        this.create_time = Calendar.getInstance().getTime();
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getPathToFoto() {
        return pathToFoto;
    }

    public void setPathToFoto(String pathToFoto) {
        this.pathToFoto = pathToFoto;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
