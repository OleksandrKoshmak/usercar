package models;

import javax.persistence.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Auto> autosCollection;



    public User() {
    }

    public User(String name) {
        this.name = name;
        autosCollection = new ArrayList<>();
    }

    public void addAuto(Auto auto) {
        auto.setUser(this);
        autosCollection.add(auto);
    }

    public void deleteAuto(Auto auto) {
        autosCollection.remove(auto);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public List<Auto> getAutosCollection() {
        return autosCollection;
    }

    public void setAutosCollection(List<Auto> autosCollection) {
        this.autosCollection = autosCollection;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", autosCollection=" + autosCollection +
                '}';
    }
}
