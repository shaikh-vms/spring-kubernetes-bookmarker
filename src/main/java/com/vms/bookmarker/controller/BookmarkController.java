package com.vms.bookmarker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vms.bookmarker.dto.BookmarkDTO;
import com.vms.bookmarker.service.BookmarkService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {

	private final BookmarkService bookmarkService;

	@GetMapping
	public BookmarkDTO getbookmarks(@RequestParam(value = "page", defaultValue = "1") Integer page) {
		return bookmarkService.getbookmarks(page);
	}
}
