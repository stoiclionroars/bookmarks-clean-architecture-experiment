package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.domain.Folder;

import java.util.List;
import java.util.UUID;

public interface GetAllFoldersUseCase {

    List<Folder> getAllFoldersBy(UUID workspaceId);
}
