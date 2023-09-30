package dev.stoiclionroars.bookmarks.dataprovider.data;

import dev.stoiclionroars.bookmarks.business.data.AddWorkspace;
import dev.stoiclionroars.bookmarks.business.data.DeleteWorkspace;
import dev.stoiclionroars.bookmarks.business.data.GetAllWorkspaces;
import dev.stoiclionroars.bookmarks.business.data.UpdateWorkspace;
import dev.stoiclionroars.bookmarks.business.domain.Workspace;
import dev.stoiclionroars.bookmarks.dataprovider.data.mapper.WorkspaceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class WorkspaceDao implements AddWorkspace, GetAllWorkspaces, UpdateWorkspace, DeleteWorkspace {


 @Autowired
 private JdbcTemplate jdbcTemplate;

 @Override
    public List<Workspace> getAllWorkspaces() {
        String sql = "SELECT * FROM workspace";
        return jdbcTemplate.query(sql,new WorkspaceMapper());
    }

    @Override
    public void add(Workspace workspace) {
        String sql = "INSERT INTO workspace(id, name, description) VALUES  (?, ?, ?)";
        jdbcTemplate.update(sql,
                workspace.getId(),
                workspace.getName(),
                workspace.getDescription()
        );
    }

    @Override
    public void delete(Workspace workspace) {
        String sql = "DELETE FROM workspace WHERE  id = ?";
        jdbcTemplate.update(sql, workspace.getId());
    }

    @Override
    public void update(Workspace workspace) {
        String sql = "UPDATE workspace SET name = ?, description + ? WHERE id = ?";
        jdbcTemplate.update(sql, workspace.getName(), workspace.getDescription(), workspace.getId());
    }
}
