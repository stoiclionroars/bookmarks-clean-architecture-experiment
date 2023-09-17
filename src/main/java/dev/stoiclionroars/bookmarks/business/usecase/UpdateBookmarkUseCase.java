package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.data.UpdateBookmark;
import dev.stoiclionroars.bookmarks.business.domain.Bookmark;

public class UpdateBookmarkUseCase implements UpdateBookmark {

    private UpdateBookmark data;

    public UpdateBookmarkUseCase(UpdateBookmark data) {
        this.data = data;
    }

    @Override
    public void updateBookmark(Bookmark bookmark) {
        data.updateBookmark(bookmark);
    }
    
}
