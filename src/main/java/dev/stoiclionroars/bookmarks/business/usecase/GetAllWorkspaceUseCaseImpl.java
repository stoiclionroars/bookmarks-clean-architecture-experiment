package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.data.GetAllWorkspace;
import dev.stoiclionroars.bookmarks.business.domain.Workspace;

import java.util.List;

public class GetAllWorkspaceUseCaseImpl implements GetAllWorkspaceUseCase {

    private GetAllWorkspace data;

    public GetAllWorkspaceUseCaseImpl(GetAllWorkspace data) {
        this.data = data;
    }

    @Override
    public List<Workspace> getAllWorkspace() {
        return data.getAll();
    }

}
