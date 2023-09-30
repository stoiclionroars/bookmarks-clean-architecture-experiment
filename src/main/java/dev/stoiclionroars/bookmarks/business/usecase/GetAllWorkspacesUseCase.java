package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.domain.Workspace;

import java.util.List;

public interface GetAllWorkspacesUseCase {

    List<Workspace> getAllWorkspace();

}
