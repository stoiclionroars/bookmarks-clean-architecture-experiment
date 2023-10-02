package dev.stoiclionroars.bookmarks.entrypoint.controller;

import dev.stoiclionroars.bookmarks.business.domain.Folder;
import dev.stoiclionroars.bookmarks.business.usecase.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/workspace/{workspaceId}/folder")
public class FolderController {

    private final AddFolderUseCase addFolderUseCase;

    private final GetAllFoldersUseCase getAllFoldersUseCase;

    private final UpdateFolderUseCase updateFolderUseCase;

    private final DeleteFolderUseCase deleteFolderUseCase;

    public FolderController(
            AddFolderUseCase addFolderUseCase,
            GetAllFoldersUseCase getAllFoldersUseCase,
            UpdateFolderUseCase updateFolderUseCase,
            DeleteFolderUseCase deleteFolderUseCase) {
        this.addFolderUseCase = addFolderUseCase;
        this.getAllFoldersUseCase = getAllFoldersUseCase;
        this.updateFolderUseCase = updateFolderUseCase;
        this.deleteFolderUseCase = deleteFolderUseCase;
    }

    @PostMapping
    public ResponseEntity<String> addFolder(@PathVariable UUID workspaceId, @RequestBody Folder folder) {
        addFolderUseCase.add(workspaceId,folder);
        return new ResponseEntity<>("The Folder has been created correctly.", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Folder>> getAllFoldersBy(@PathVariable UUID workspaceId) {
        List<Folder> folders = getAllFoldersUseCase.getAllFoldersBy(workspaceId);
        return new ResponseEntity<>(folders, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<String> updateFolder(@PathVariable UUID workspaceId, @RequestBody Folder folder) {
        updateFolderUseCase.update(workspaceId, folder);
        return new ResponseEntity<>("The folder has been updated correctly.", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteFolder(@PathVariable UUID workspaceId, @RequestBody Folder folder) {
        deleteFolderUseCase.delete(workspaceId, folder);
        return new ResponseEntity<>("The folder has been deleted correctly.", HttpStatus.OK);
    }
}
