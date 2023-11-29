package appSpringBoot.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class        Address {
    @Id
    @GeneratedValue
    private Long id;
    private Date creation;
    private String content;

    private String name;

    public Long getId() {
        return id;
    }

    public Date getCreation() {
        return creation;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }
}
