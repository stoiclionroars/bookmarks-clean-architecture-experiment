package dev.stoiclionroars.bookmarks.business.usecase;

import java.util.List;

import dev.stoiclionroars.bookmarks.business.data.GetAllBookmarks;
import dev.stoiclionroars.bookmarks.business.domain.Bookmark;

public class GetAllBookmarksUseCaseImpl implements GetAllBookmarksUseCase {

    private GetAllBookmarks data;

    public GetAllBookmarksUseCaseImpl(GetAllBookmarks data) {
        this.data = data;
    }

    @Override
    public List<Bookmark> getAllBookmarks() {
        return data.getAllBookmarks();
    }
    
}