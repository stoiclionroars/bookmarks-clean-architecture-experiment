package dev.stoiclionroars.bookmarks.dataprovider.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import dev.stoiclionroars.bookmarks.business.data.AddBookmark;
import dev.stoiclionroars.bookmarks.business.data.DeleteBookmark;
import dev.stoiclionroars.bookmarks.business.data.GetAllBookmarks;
import dev.stoiclionroars.bookmarks.business.data.UpdateBookmark;
import dev.stoiclionroars.bookmarks.business.domain.Bookmark;
import dev.stoiclionroars.bookmarks.dataprovider.data.mapper.BookmarkMapper;

public class BookmarkDao implements AddBookmark, GetAllBookmarks, UpdateBookmark, DeleteBookmark {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void delete(Bookmark bookmark) {
        String sql = "DELETE FROM bookmark WHERE id = ?";
        jdbcTemplate.update(sql, bookmark.getId());
    }

    @Override
    public void updateBookmark(Bookmark bookmark) {
        String sql = " UPDATE bookmark set name = ?, description = ?, link = ? WHERE id = ?";
        jdbcTemplate.update(sql, bookmark.getName(), bookmark.getDescription(), bookmark.getLink(), bookmark.getId());
    }

    @Override
    public List<Bookmark> getAllBookmarks() {
        String sql = "SELECT * FROM bookmark";
        return jdbcTemplate.query(sql, new BookmarkMapper());
    }

    @Override
    public void add(Bookmark bookmark) {
        String sql = " INSERT INTO bookmark(id, name, description, link) VALUES ( ?, ?, ?, ?)";
        jdbcTemplate.update(sql, 
            bookmark.getId(), 
            bookmark.getName(), 
            bookmark.getDescription(),
            bookmark.getLink()
        );
    }
    
}
