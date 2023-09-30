package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.data.UpdateWorkspace;
import dev.stoiclionroars.bookmarks.business.domain.Workspace;

public class UpdateWorkspaceUseCaseImpl implements UpdateWorkspaceUseCase {

    private UpdateWorkspace data;

    public UpdateWorkspaceUseCaseImpl(UpdateWorkspace data) {
        this.data = data;
    }

    @Override
    public void update(Workspace workspace) {
        data.update(workspace);
    }

}
