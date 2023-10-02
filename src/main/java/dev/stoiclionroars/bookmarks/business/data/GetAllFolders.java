package dev.stoiclionroars.bookmarks.business.data;

import dev.stoiclionroars.bookmarks.business.domain.Folder;

import java.util.List;
import java.util.UUID;

public interface GetAllFolders {

    List<Folder> getAllFoldersBy(UUID workspaceId);

}
