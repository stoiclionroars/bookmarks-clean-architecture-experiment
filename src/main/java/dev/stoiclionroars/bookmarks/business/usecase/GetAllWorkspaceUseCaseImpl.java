package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.data.GetAllWorkspaces;
import dev.stoiclionroars.bookmarks.business.domain.Workspace;

import java.util.List;

public class GetAllWorkspaceUseCaseImpl implements GetAllWorkspaceUseCase {

    private GetAllWorkspaces data;

    public GetAllWorkspaceUseCaseImpl(GetAllWorkspaces data) {
        this.data = data;
    }

    @Override
    public List<Workspace> getAllWorkspace() {
        return data.getAllWorkspaces();
    }

}
