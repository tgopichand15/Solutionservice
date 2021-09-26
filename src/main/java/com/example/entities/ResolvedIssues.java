package com.example.entities;

import javax.persistence.*;

@Entity
@Table(name="resolvedissues")
public class ResolvedIssues {

    @Id
    @Column(name="issueId")
    @GeneratedValue(Strategy=GenerationType.IDENTITY)
    int id;

    @Column(name="issuename")
    private String issuename;

    @Column(name="hostname")
    private String hostname;

    @Column(name="count")
    private int count;

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

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "ResolvedIssues{" +
                "id=" + id +
                ", issuename='" + issuename + '\'' +
                ", hostname='" + hostname + '\'' +
                ", count=" + count +
                '}';
    }
}
