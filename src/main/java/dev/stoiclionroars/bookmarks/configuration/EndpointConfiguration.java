package dev.stoiclionroars.bookmarks.configuration;

import dev.stoiclionroars.bookmarks.business.usecase.*;
import dev.stoiclionroars.bookmarks.entrypoint.controller.FolderController;
import dev.stoiclionroars.bookmarks.entrypoint.controller.WorkspaceController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.stoiclionroars.bookmarks.FakeController;
import dev.stoiclionroars.bookmarks.entrypoint.controller.BookmarkController;

@Configuration
public class EndpointConfiguration {

    @Bean
    BookmarkController bookmarkController(
        AddBookmarkUseCase addBookmarkUseCase,
        GetAllBookmarksUseCase getAllBookmarksUseCase,
        UpdateBookmarkUseCase updateBookmarkUseCase,
        DeleteBookmarkUseCase deleteBookmarkUseCase) {
        return new BookmarkController(
                addBookmarkUseCase,
                getAllBookmarksUseCase,
                updateBookmarkUseCase,
                deleteBookmarkUseCase
            );
    }

    @Bean
    WorkspaceController workspaceController(
            AddWorkspaceUseCase addWorkspaceUseCase,
            GetAllWorkspacesUseCase getAllWorkspacesUseCase,
            UpdateWorkspaceUseCase updateWorkspaceUseCase,
            DeleteWorkspaceUseCase deleteWorkspaceUseCase) {
        return new WorkspaceController(
                addWorkspaceUseCase,
                getAllWorkspacesUseCase,
                updateWorkspaceUseCase,
                deleteWorkspaceUseCase
        );
    }

    @Bean
    FolderController folderController(
            AddFolderUseCase addFolderUseCase,
            GetAllFoldersUseCase getAllFoldersUseCase,
            UpdateFolderUseCase updateFolderUseCase,
            DeleteFolderUseCase deleteFolderUseCase) {
        return new FolderController(
                addFolderUseCase,
                getAllFoldersUseCase,
                updateFolderUseCase,
                deleteFolderUseCase
        );
    }

    @Bean
    FakeController fakeController() {
        return new FakeController();
    }
    
}
