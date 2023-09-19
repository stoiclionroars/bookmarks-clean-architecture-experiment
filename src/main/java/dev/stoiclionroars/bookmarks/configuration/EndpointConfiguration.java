package dev.stoiclionroars.bookmarks.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.stoiclionroars.bookmarks.FakeController;
import dev.stoiclionroars.bookmarks.business.usecase.AddBookmarkUseCase;
import dev.stoiclionroars.bookmarks.business.usecase.UpdateBookmarkUseCase;
import dev.stoiclionroars.bookmarks.business.usecase.DeleteBookmarkUseCase;
import dev.stoiclionroars.bookmarks.business.usecase.GetAllBookmarksUseCase;
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
    FakeController fakeController() {
        return new FakeController();
    }
    
}
