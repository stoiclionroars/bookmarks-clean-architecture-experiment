package dev.stoiclionroars.bookmarks.business.data;

import dev.stoiclionroars.bookmarks.business.domain.Folder;

import java.util.UUID;

public interface AddFolder {

    void add(UUID workspaceId, Folder folder);

}
