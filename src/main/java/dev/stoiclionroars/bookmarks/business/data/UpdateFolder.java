package dev.stoiclionroars.bookmarks.business.data;

import dev.stoiclionroars.bookmarks.business.domain.Folder;

import java.util.UUID;

public interface UpdateFolder {

    void update(UUID workspaceId, Folder folder);

}
