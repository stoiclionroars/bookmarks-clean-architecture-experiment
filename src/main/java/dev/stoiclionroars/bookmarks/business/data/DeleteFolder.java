package dev.stoiclionroars.bookmarks.business.data;

import dev.stoiclionroars.bookmarks.business.domain.Folder;

import java.util.UUID;

public interface DeleteFolder {

    void delete(UUID workspaceId, Folder folder);

}
