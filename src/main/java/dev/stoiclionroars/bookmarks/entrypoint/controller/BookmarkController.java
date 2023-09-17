package dev.stoiclionroars.bookmarks.entrypoint.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.stoiclionroars.bookmarks.business.domain.Bookmark;
import dev.stoiclionroars.bookmarks.business.usecase.AddBookmarkUseCase;

@RestController
@RequestMapping("/bookmark")
public class BookmarkController {

    private final AddBookmarkUseCase addBookmarkUseCase;

    public BookmarkController(AddBookmarkUseCase addBookmarkUseCase) {
        this.addBookmarkUseCase = addBookmarkUseCase;
    }

    @PostMapping
    public ResponseEntity addBookmark(@RequestBody Bookmark bookmark) {
        addBookmarkUseCase.add(bookmark);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    
}
