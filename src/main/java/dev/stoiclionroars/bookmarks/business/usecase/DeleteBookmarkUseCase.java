package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.data.DeleteBookmark;
import dev.stoiclionroars.bookmarks.business.domain.Bookmark;

public class DeleteBookmarkUseCase  implements DeleteBookmark {

    private DeleteBookmark data;

    public DeleteBookmarkUseCase(DeleteBookmark data) {
        this.data = data;
    }

    @Override
    public void delete(Bookmark bookmark) {
        data.delete(bookmark);
    }
    
}
