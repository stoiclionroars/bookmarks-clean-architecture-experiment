package dev.stoiclionroars.bookmarks.entrypoint.controller;

import dev.stoiclionroars.bookmarks.business.domain.Workspace;
import dev.stoiclionroars.bookmarks.business.usecase.AddWorkspaceUseCase;
import dev.stoiclionroars.bookmarks.business.usecase.DeleteWorkspaceUseCase;
import dev.stoiclionroars.bookmarks.business.usecase.GetAllWorkspacesUseCase;
import dev.stoiclionroars.bookmarks.business.usecase.UpdateWorkspaceUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workspace")
public class WorkspaceController {

    private final AddWorkspaceUseCase addWorkspaceUseCase;

    private final DeleteWorkspaceUseCase deleteWorkspaceUseCase;

    private final GetAllWorkspacesUseCase getAllWorkspacesUseCase;

    private final UpdateWorkspaceUseCase updateWorkspaceUseCase;

    public WorkspaceController(
            AddWorkspaceUseCase addWorkspaceUseCase,
            GetAllWorkspacesUseCase getAllWorkspacesUseCase,
            UpdateWorkspaceUseCase updateWorkspaceUseCase,
            DeleteWorkspaceUseCase deleteWorkspaceUseCase ) {
        this.addWorkspaceUseCase = addWorkspaceUseCase;
        this.getAllWorkspacesUseCase = getAllWorkspacesUseCase;
        this.updateWorkspaceUseCase = updateWorkspaceUseCase;
        this.deleteWorkspaceUseCase = deleteWorkspaceUseCase;
    }

    @PostMapping
    public ResponseEntity<String> addWorkspace(@RequestBody Workspace workspace) {
        addWorkspaceUseCase.add(workspace);
        return new ResponseEntity<String>("The Workspace has been added correctly", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Workspace>> getAllWorkspace() {
        List<Workspace> workspaces = getAllWorkspacesUseCase.getAllWorkspace();
        return new ResponseEntity<>(workspaces, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<String> updateWorkspace(@RequestBody Workspace workspace) {
        updateWorkspaceUseCase.update(workspace);
        return new ResponseEntity<>("The Workspace has been updated correctly", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteWorkspace(@RequestBody Workspace workspace) {
        deleteWorkspaceUseCase.delete(workspace);
        return new ResponseEntity<>("The workspace has been deleted correctly", HttpStatus.OK);
    }
}
