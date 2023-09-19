package dev.stoiclionroars.bookmarks.business.usecase;

import dev.stoiclionroars.bookmarks.business.data.AddBookmark;
import dev.stoiclionroars.bookmarks.business.domain.Bookmark;

public class AddBookmarkUseCaseImpl  implements AddBookmarkUseCase {

    private AddBookmark data;

    public AddBookmarkUseCaseImpl(AddBookmark data) {
        this.data = data;
    }

    @Override
    public void add(Bookmark bookmark) {
        data.add(bookmark);
    }
    
}
