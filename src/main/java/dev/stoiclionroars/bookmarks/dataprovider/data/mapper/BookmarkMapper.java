package dev.stoiclionroars.bookmarks.dataprovider.data.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import org.springframework.jdbc.core.RowMapper;

import dev.stoiclionroars.bookmarks.business.domain.Bookmark;

public class BookmarkMapper implements RowMapper<Bookmark>{

    @Override
    public Bookmark mapRow(ResultSet result, int arg1) throws SQLException {
        return new Bookmark(
            result.getObject("id", UUID.class), 
            result.getString("name"),
            result.getString("description"));
    }
    
}
