package com.task.LincorTask1.Item;

public class Item {
    private Long idGuid;
    private String name;

    public Item() {
    }

    public Item(Long idGuid , String name) {
        this.idGuid = idGuid;
        this.name = name;
    }

    public Item(String name) {
        this.name = name;
    }

    public Long getIdGuid() {
        return idGuid;
    }

    public void setIdGuid(Long idGuid) {
        this.idGuid = idGuid;
    }

    @Override
    public String toString() {
        return "Item{" +
                "idGuid=" + idGuid +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

