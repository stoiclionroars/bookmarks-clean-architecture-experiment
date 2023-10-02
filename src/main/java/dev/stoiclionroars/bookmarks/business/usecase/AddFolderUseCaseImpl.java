package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.data.AddFolder;
import dev.stoiclionroars.bookmarks.business.domain.Folder;

import java.util.UUID;

public class AddFolderUseCaseImpl implements AddFolderUseCase {

    private AddFolder data;

    public AddFolderUseCaseImpl(AddFolder data) {
        this.data = data;
    }

    @Override
    public void add(UUID workspaceId, Folder folder) {
        data.add(workspaceId, folder);
    }
}
