package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.data.GetAllFolders;
import dev.stoiclionroars.bookmarks.business.domain.Folder;

import java.util.List;
import java.util.UUID;

public class GetAllFoldersUseCaseImpl implements GetAllFoldersUseCase {

    private GetAllFolders data;

    public GetAllFoldersUseCaseImpl(GetAllFolders data) {
        this.data = data;
    }

    @Override
    public List<Folder> getAllFoldersBy(UUID workspaceId) {
        return data.getAllFoldersBy(workspaceId);
    }
}
