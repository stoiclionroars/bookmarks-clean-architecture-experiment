package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.domain.Bookmark;

public interface DeleteBookmarkUseCase {

    void delete(Bookmark bookmark);
    
}
