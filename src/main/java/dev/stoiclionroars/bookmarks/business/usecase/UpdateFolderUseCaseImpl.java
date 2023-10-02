package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.data.UpdateFolder;
import dev.stoiclionroars.bookmarks.business.domain.Folder;

import java.util.UUID;

public class UpdateFolderUseCaseImpl implements UpdateFolderUseCase {

    private UpdateFolder data;

    public UpdateFolderUseCaseImpl(UpdateFolder data) {
        this.data = data;
    }

    @Override
    public void update(UUID workspaceId, Folder folder) {
        data.update(workspaceId, folder);
    }

}
