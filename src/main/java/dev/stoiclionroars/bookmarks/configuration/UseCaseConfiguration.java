package dev.stoiclionroars.bookmarks.configuration;

import dev.stoiclionroars.bookmarks.business.data.*;
import dev.stoiclionroars.bookmarks.business.usecase.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean
    AddBookmarkUseCase addBookmarkUseCase(@Qualifier("AddBookmark") AddBookmark data) {
        return new AddBookmarkUseCaseImpl(data);
    }

    @Bean
    GetAllBookmarksUseCase getAllBookmarksUseCase(@Qualifier("GetAllBookmarks") GetAllBookmarks data) {
        return new GetAllBookmarksUseCaseImpl(data);
    }

    @Bean
    UpdateBookmarkUseCase updateBookmarkUseCase(@Qualifier("UpdateBookmark") UpdateBookmark data) {
        return new UpdateBookmarkUseCaseImpl(data);
    }

    @Bean
    DeleteBookmarkUseCase deleteBookmarkUseCase(@Qualifier("DeleteBookmark") DeleteBookmark data) {
        return new DeleteBookmarkUseCaseImpl(data);
    }

    @Bean
    AddWorkspaceUseCase addWorkspaceUseCase(@Qualifier("AddWorkspace") AddWorkspace data) {
        return new AddWorkspaceUseCaseImpl(data);
    }

    @Bean
    GetAllWorkspacesUseCase getAllWorkspacesUseCase(@Qualifier("GetAllWorkspaces") GetAllWorkspaces data) {
        return new GetAllWorkspacesUseCaseImpl(data);
    }

    @Bean
    UpdateWorkspaceUseCase updateWorkspaceUseCase(@Qualifier("UpdateWorkspace") UpdateWorkspace data) {
        return new UpdateWorkspaceUseCaseImpl(data);
    }

    @Bean
    DeleteWorkspaceUseCase deleteWorkspaceUseCase(@Qualifier("DeleteWorkspace") DeleteWorkspace data) {
        return new DeleteWorkspaceUseCaseImpl(data);
    }

    @Bean
    AddFolderUseCase addFolderUseCase(@Qualifier("AddFolder") AddFolder data) {
        return new AddFolderUseCaseImpl(data);
    }

    @Bean
    GetAllFoldersUseCase getAllFoldersUseCase(@Qualifier("GetAllFolders") GetAllFolders data) {
        return new GetAllFoldersUseCaseImpl(data);
    }

    @Bean
    UpdateFolderUseCase updateFolderUseCase(@Qualifier("UpdateFolder") UpdateFolder data) {
        return new UpdateFolderUseCaseImpl(data);
    }

    @Bean
    DeleteFolderUseCase deleteFolderUseCase(@Qualifier("DeleteFolder") DeleteFolder data) {
        return new DeleteFolderUseCaseImpl(data);
    }

}
