package dev.stoiclionroars.bookmarks.configuration;

import dev.stoiclionroars.bookmarks.business.usecase.*;
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
    FakeController fakeController() {
        return new FakeController();
    }
    
}
