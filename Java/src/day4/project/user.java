package day4.project;

import java.util.Set;

public class user {
    private String name;
    private boolean active;
    private Set<String> role;

    public user(boolean active,String name,Set<String> role) {
        this.active=active;
        this.name=name;
        this.role=role;
    }

    public boolean isActive() {
        return active;
    }

    public String getName() {
        return name;
    }

    public Set<String> getRole() {
        return role;
    }
}
