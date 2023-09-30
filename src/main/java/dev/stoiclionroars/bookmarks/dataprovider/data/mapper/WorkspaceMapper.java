package dev.stoiclionroars.bookmarks.dataprovider.data.mapper;

import dev.stoiclionroars.bookmarks.business.domain.Workspace;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class WorkspaceMapper implements RowMapper<Workspace> {

    @Override
    public Workspace mapRow(ResultSet result, int arg1) throws SQLException {
        return new Workspace(
                result.getObject("id", UUID.class),
                result.getString("name"),
                result.getString("description")
        );
    }
}
