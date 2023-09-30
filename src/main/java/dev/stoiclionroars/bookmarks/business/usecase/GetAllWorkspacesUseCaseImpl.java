package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.data.GetAllWorkspaces;
import dev.stoiclionroars.bookmarks.business.domain.Workspace;

import java.util.List;

public class GetAllWorkspacesUseCaseImpl implements GetAllWorkspacesUseCase {

    private GetAllWorkspaces data;

    public GetAllWorkspacesUseCaseImpl(GetAllWorkspaces data) {
        this.data = data;
    }

    @Override
    public List<Workspace> getAllWorkspace() {
        return data.getAllWorkspaces();
    }

}
