package com.tt;

public class Task {

    private long id;
    private String owner;
    private String name;
    private String description;
    private String type;

    public Task(String owner, String name, String description) {
        this.owner = owner;
        this.name = name;
        this.description = description;
        type = "TO-DO";
        id = IdProvider.generateId();
    }

    public Task(String owner, String name) {
        this.owner = owner;
        this.name = name;
        type = "TO-DO";
        id = IdProvider.generateId();
    }

    @Override
    public String toString() {
        return
                " id:       " + id + '\n' +
                " osoba:    " + owner + '\n' +
                " nazwa:    " + name + '\n' +
                " opis:     " + description + '\n' +
                " typ:      " + type + '\n';
    }
}
dfgdg