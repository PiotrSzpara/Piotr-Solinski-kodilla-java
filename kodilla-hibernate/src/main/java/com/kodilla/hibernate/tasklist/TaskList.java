package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {
    private int id;
    private String listName;
    private String description;

    public  TaskList() {
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskList)) return false;
        TaskList taskList = (TaskList) o;
        return Objects.equals(listName, taskList.listName) && Objects.equals(description, taskList.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listName, description);
    }
}
