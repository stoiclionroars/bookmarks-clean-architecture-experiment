package dev.stoiclionroars.bookmarks.dataprovider.data;

import dev.stoiclionroars.bookmarks.business.data.AddFolder;
import dev.stoiclionroars.bookmarks.business.data.DeleteFolder;
import dev.stoiclionroars.bookmarks.business.data.GetAllFolders;
import dev.stoiclionroars.bookmarks.business.data.UpdateFolder;
import dev.stoiclionroars.bookmarks.business.domain.Folder;
import dev.stoiclionroars.bookmarks.dataprovider.data.mapper.FolderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.UUID;

public class FolderDao implements AddFolder, GetAllFolders, UpdateFolder, DeleteFolder {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(UUID workspaceId, Folder folder) {
        String sql = """
                INSERT INTO folder(id, name, description, workspaceId)
                VALUES(?, ?, ?, ?)
                """;
        jdbcTemplate.update(sql,
                folder.getId(),
                folder.getName(),
                folder.getDescription(),
                workspaceId
                );
    }

    @Override
    public List<Folder> getAllFoldersBy(UUID workspaceId) {
        String sql = "SELECT * FROM folder WHERE workspace_id = ?";
        return jdbcTemplate.query(sql, new FolderMapper());
    }

    @Override
    public void update(UUID workspaceId, Folder folder) {
        String sql = """
                UPDATE folder
                SET name = ?,
                    description = ?,
                    workspace_id = ?
                WHERE
                    id = ?
                """;
        jdbcTemplate.update(sql,
                folder.getName(),
                folder.getDescription(),
                workspaceId,
                folder.getId()
                );
    }

    @Override
    public void delete(UUID workspaceId, Folder folder) {
        String sql = "DELETE FROM folder WHERE id = ? AND workspace_id = ?";
        jdbcTemplate.update(sql,folder.getId(), workspaceId);
    }
}
