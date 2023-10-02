package dev.stoiclionroars.bookmarks.dataprovider.data.mapper;

import dev.stoiclionroars.bookmarks.business.domain.Folder;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import org.springframework.jdbc.core.RowMapper;

public class FolderMapper implements RowMapper<Folder> {

    @Override
    public Folder mapRow(ResultSet result, int arg1) throws SQLException {
        return new Folder(
                result.getObject("id", UUID.class),
                result.getString("name"),
                result.getString("description")
        );
    }
}
