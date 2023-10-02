package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.domain.Folder;

import java.util.UUID;

public interface AddFolderUseCase {

    void add(UUID workspaceId, Folder folder);

}
