package dev.stoiclionroars.bookmarks.entrypoint.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.stoiclionroars.bookmarks.business.domain.Bookmark;
import dev.stoiclionroars.bookmarks.business.usecase.AddBookmarkUseCase;
import dev.stoiclionroars.bookmarks.business.usecase.GetAllBookmarksUseCase;
import dev.stoiclionroars.bookmarks.business.usecase.UpdateBookmarkUseCase;
import dev.stoiclionroars.bookmarks.business.usecase.DeleteBookmarkUseCase;

@RestController
@RequestMapping("/bookmark")
public class BookmarkController {

    private final AddBookmarkUseCase addBookmarkUseCase;

    private final DeleteBookmarkUseCase deleteBookmarkUseCase;

    private GetAllBookmarksUseCase getAllBookmarksUsesCase;

    private UpdateBookmarkUseCase updateBookmarkUseCase;

    public BookmarkController(
        AddBookmarkUseCase addBookmarkUseCase,
        GetAllBookmarksUseCase getAllBookmarksUsesCase,
        UpdateBookmarkUseCase updateBookmarkUseCase,
        DeleteBookmarkUseCase deleteBookmarkUseCase) {
        this.addBookmarkUseCase = addBookmarkUseCase;
        this.getAllBookmarksUsesCase = getAllBookmarksUsesCase;
        this.updateBookmarkUseCase = updateBookmarkUseCase;
        this.deleteBookmarkUseCase = deleteBookmarkUseCase;
    }

    @PostMapping
    public ResponseEntity addBookmark(@RequestBody Bookmark bookmark) {
        addBookmarkUseCase.add(bookmark);
        return new ResponseEntity<String>("The Bookmark has been added correctly.", HttpStatus.OK); 
    }

    @GetMapping
    public ResponseEntity getAllBookmark() {
        List<Bookmark> bookmarks = getAllBookmarksUsesCase.getAllBookmarks();
        return new ResponseEntity<List<Bookmark>>(bookmarks, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity updateBookmark(@RequestBody Bookmark bookmark) {
        updateBookmarkUseCase.update(bookmark);
         return new ResponseEntity<String>("The Bookmark has been updated correctly.", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity deleteBookmark(@RequestBody Bookmark bookmark) {
        deleteBookmarkUseCase.delete(bookmark);
         return new ResponseEntity<String>("The Bookmark has been deleted correctly.", HttpStatus.OK);

    }
    
}
