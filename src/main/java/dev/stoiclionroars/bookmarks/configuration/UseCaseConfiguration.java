package dev.stoiclionroars.bookmarks.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.stoiclionroars.bookmarks.business.data.AddBookmark;
import dev.stoiclionroars.bookmarks.business.data.GetAllBookmarks;
import dev.stoiclionroars.bookmarks.business.data.UpdateBookmark;
import dev.stoiclionroars.bookmarks.business.data.DeleteBookmark;
import dev.stoiclionroars.bookmarks.business.usecase.AddBookmarkUseCase;
import dev.stoiclionroars.bookmarks.business.usecase.AddBookmarkUseCaseImpl;
import dev.stoiclionroars.bookmarks.business.usecase.GetAllBookmarksUseCase;
import dev.stoiclionroars.bookmarks.business.usecase.GetAllBookmarksUseCaseImpl;
import dev.stoiclionroars.bookmarks.business.usecase.UpdateBookmarkUseCase;
import dev.stoiclionroars.bookmarks.business.usecase.UpdateBookmarkUseCaseImpl;
import dev.stoiclionroars.bookmarks.business.usecase.DeleteBookmarkUseCase;
import dev.stoiclionroars.bookmarks.business.usecase.DeleteBookmarkUseCaseImpl;

@Configuration
public class UseCaseConfiguration {

    @Bean
    AddBookmarkUseCase addBookmarkUseCase(@Qualifier("AddBookmark") AddBookmark data){
        return new AddBookmarkUseCaseImpl(data);
    }

    @Bean
    GetAllBookmarksUseCase getAllBookmarksUseCase(@Qualifier("GetAllBookmarks") GetAllBookmarks data){
        return new GetAllBookmarksUseCaseImpl(data);
    }

    @Bean
    UpdateBookmarkUseCase updateBookmarkUseCase(@Qualifier("UpdateBookmark") UpdateBookmark data){
        return new UpdateBookmarkUseCaseImpl(data);
    }

    @Bean
    DeleteBookmarkUseCase deleteBookmarkUseCase(@Qualifier("DeleteBookmark") DeleteBookmark data){
        return new DeleteBookmarkUseCaseImpl(data);
    }
    
}
