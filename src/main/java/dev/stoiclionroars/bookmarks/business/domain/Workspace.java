package dev.stoiclionroars.bookmarks.business.domain;

import java.util.UUID;

public class Workspace {

    private UUID id;

    private String name;

    private String description;

    public Workspace(UUID id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public UUID getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
