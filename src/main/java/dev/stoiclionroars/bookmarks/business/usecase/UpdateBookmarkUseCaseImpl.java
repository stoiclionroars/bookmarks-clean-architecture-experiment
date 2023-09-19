package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.data.UpdateBookmark;
import dev.stoiclionroars.bookmarks.business.domain.Bookmark;

public class UpdateBookmarkUseCaseImpl implements UpdateBookmarkUseCase {

    private UpdateBookmark data;

    public UpdateBookmarkUseCaseImpl(UpdateBookmark data) {
        this.data = data;
    }

    @Override
    public void updateBookmark(Bookmark bookmark) {
        data.updateBookmark(bookmark);
    }
    
}
