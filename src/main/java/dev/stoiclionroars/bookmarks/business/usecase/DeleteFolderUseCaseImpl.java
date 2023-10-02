package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.data.DeleteFolder;
import dev.stoiclionroars.bookmarks.business.domain.Folder;

import java.util.UUID;

public class DeleteFolderUseCaseImpl implements DeleteFolderUseCase {

    private DeleteFolder data;

    public DeleteFolderUseCaseImpl(DeleteFolder data) {
        this.data = data;
    }

    @Override
    public void delete(UUID workspaceId, Folder folder) {
        data.delete(workspaceId, folder);
    }

}
