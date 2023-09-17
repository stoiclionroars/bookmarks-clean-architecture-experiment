package dev.stoiclionroars.bookmarks.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.stoiclionroars.bookmarks.FakeController;
import dev.stoiclionroars.bookmarks.business.usecase.AddBookmarkUseCase;
import dev.stoiclionroars.bookmarks.entrypoint.controller.BookmarkController;

@Configuration
public class EndpointConfiguration {

    @Bean
    BookmarkController bookmarkController(AddBookmarkUseCase usecase) {
        return new BookmarkController(usecase);
    }

    @Bean
    FakeController fakeController() {
        return new FakeController();
    }
    
}
