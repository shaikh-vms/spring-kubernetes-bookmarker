package com.vms.bookmarker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vms.bookmarker.entity.Bookmark;
import com.vms.bookmarker.service.BookmarkService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {

	private final BookmarkService bookmarkService;

	@GetMapping
	public List<Bookmark> getbookmarks() {
		return bookmarkService.getbookmarks();
	}
}
