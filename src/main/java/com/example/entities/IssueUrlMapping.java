package com.example.entities;

import javax.persistence.*;

@Entity
@Table(name="issueurlmapping")
public class IssueUrlMapping {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;

    String issuename;

    String URL;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIssuename() {
        return issuename;
    }

    public void setIssuename(String issuename) {
        this.issuename = issuename;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "IssueUrlMapping{" +
                "id=" + id +
                ", issuename='" + issuename + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }

}
