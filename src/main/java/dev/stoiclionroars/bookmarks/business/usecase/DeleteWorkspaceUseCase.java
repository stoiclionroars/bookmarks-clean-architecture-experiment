package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.domain.Workspace;

public interface DeleteWorkspaceUseCase {

    void delete(Workspace workspace);

}
