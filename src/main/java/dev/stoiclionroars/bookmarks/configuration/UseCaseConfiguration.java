package dev.stoiclionroars.bookmarks.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.stoiclionroars.bookmarks.business.data.AddBookmark;
import dev.stoiclionroars.bookmarks.business.usecase.AddBookmarkUseCase;

@Configuration
public class UseCaseConfiguration {

    @Bean
    AddBookmarkUseCase addBookmarkUseCase(AddBookmark data){
        return new AddBookmarkUseCase(data);
    }
    
}
