package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.domain.Folder;

import java.util.UUID;

public interface UpdateFolderUseCase {

    void update(UUID workspaceId, Folder folder);

}
