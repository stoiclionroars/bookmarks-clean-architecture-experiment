package dev.stoiclionroars.bookmarks.business.usecase;

import java.util.List;

import dev.stoiclionroars.bookmarks.business.domain.Bookmark;

public interface GetAllBookmarksUseCase {

    List<Bookmark> getAllBookmarks();

}
