package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.data.DeleteWorkspace;
import dev.stoiclionroars.bookmarks.business.domain.Workspace;

public class DeleteWorkspaceUseCaseImpl implements DeleteWorkspaceUseCase {

    private DeleteWorkspace data;

    public DeleteWorkspaceUseCaseImpl(DeleteWorkspace data) {
        this.data = data;
    }

    @Override
    public void delete(Workspace workspace) {
        data.delete(workspace);
    }

}
