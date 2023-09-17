package dev.stoiclionroars.bookmarks.configuration;

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
}
