package dev.stoiclionroars.bookmarks.configuration;

import dev.stoiclionroars.bookmarks.business.data.DeleteBookmark;
import dev.stoiclionroars.bookmarks.business.data.GetAllBookmarks;
import dev.stoiclionroars.bookmarks.business.data.UpdateBookmark;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.stoiclionroars.bookmarks.business.data.AddBookmark;
import dev.stoiclionroars.bookmarks.dataprovider.data.BookmarkDao;

@Configuration
public class DaoConfiguration {
    
    @Bean 
    AddBookmark addBookmark() {
        return new BookmarkDao();
    }

    @Bean
    GetAllBookmarks getAllBookmarks() {
        return new BookmarkDao();
    }

    @Bean
    UpdateBookmark updateBookmark() {
        return new BookmarkDao();
    }

    @Bean
    DeleteBookmark deleteBookmark() {
        return new BookmarkDao();
    }
}
