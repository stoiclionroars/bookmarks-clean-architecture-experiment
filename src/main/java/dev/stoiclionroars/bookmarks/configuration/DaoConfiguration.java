package dev.stoiclionroars.bookmarks.configuration;

import dev.stoiclionroars.bookmarks.business.data.*;
import dev.stoiclionroars.bookmarks.dataprovider.data.WorkspaceDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.stoiclionroars.bookmarks.dataprovider.data.BookmarkDao;

@Configuration
public class DaoConfiguration {
    
    @Bean("AddBookmark")
    AddBookmark addBookmark() {
        return new BookmarkDao();
    }

    @Bean("GetAllBookmarks")
    GetAllBookmarks getAllBookmarks() {
        return new BookmarkDao();
    }

    @Bean("UpdateBookmark")
    UpdateBookmark updateBookmark() {
        return new BookmarkDao();
    }

    @Bean("DeleteBookmark")
    DeleteBookmark deleteBookmark() {
        return new BookmarkDao();
    }

    @Bean("AddWorkspace")
    AddWorkspace AddWorkspace() {
        return new WorkspaceDao();
    }

    @Bean("GetAllWorkspaces")
    GetAllWorkspaces getAllWorkspaces() {
        return new WorkspaceDao();
    }

    @Bean("UpdateWorkspace")
    UpdateWorkspace updateWorkspace() {
        return new WorkspaceDao();
    }

    @Bean("DeleteWorkspace")
    DeleteWorkspace deleteWorkspace() {
        return new WorkspaceDao();
    }

}
