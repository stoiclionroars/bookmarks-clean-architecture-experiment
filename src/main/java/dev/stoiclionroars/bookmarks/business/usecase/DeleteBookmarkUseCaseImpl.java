package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.data.DeleteBookmark;
import dev.stoiclionroars.bookmarks.business.domain.Bookmark;

public class DeleteBookmarkUseCaseImpl  implements DeleteBookmarkUseCase {

    private DeleteBookmark data;

    public DeleteBookmarkUseCaseImpl(DeleteBookmark data) {
        this.data = data;
    }

    @Override
    public void delete(Bookmark bookmark) {
        data.delete(bookmark);
    }
    
}
