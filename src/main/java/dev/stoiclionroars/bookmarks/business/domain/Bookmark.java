package dev.stoiclionroars.bookmarks.business.domain;

import java.util.UUID;

public class Bookmark {

    private UUID id;

    private String name;

    private String description;

    private String link;
    

    public Bookmark(UUID id, String name, String description, String link) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.link = link;
    }
    

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }
}
