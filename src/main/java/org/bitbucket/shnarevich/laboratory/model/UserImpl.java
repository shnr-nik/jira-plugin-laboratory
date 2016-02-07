package org.bitbucket.shnarevich.laboratory.model;

public class UserImpl implements User {
    private String name;

    public UserImpl(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
