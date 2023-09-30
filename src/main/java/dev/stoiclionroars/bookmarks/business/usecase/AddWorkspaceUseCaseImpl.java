package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.data.AddWorkspace;
import dev.stoiclionroars.bookmarks.business.domain.Workspace;

public class AddWorkspaceUseCaseImpl implements AddWorkspaceUseCase {

    private AddWorkspace data;

    public AddWorkspaceUseCaseImpl(AddWorkspace data) {
        this.data = data;
    }

    @Override
    public void add(Workspace workspace) {
        data.add(workspace);
    }

}
