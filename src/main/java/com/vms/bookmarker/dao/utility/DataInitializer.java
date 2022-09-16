package com.vms.bookmarker.dao.utility;

import java.time.Instant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vms.bookmarker.dao.BookmarkRepository;
import com.vms.bookmarker.entity.Bookmark;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

	private final BookmarkRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Bookmark(null, "vmsBookmark1", "https://www.google.com", Instant.now()));
		repository.save(new Bookmark(null, "vmsBookmark2", "https://www.google.com", Instant.now()));
		repository.save(new Bookmark(null, "vmsBookmark3", "https://www.google.com", Instant.now()));
		repository.save(new Bookmark(null, "vmsBookmark4", "https://www.google.com", Instant.now()));
		repository.save(new Bookmark(null, "vmsBookmark5", "https://www.google.com", Instant.now()));
		repository.save(new Bookmark(null, "vmsBookmark6", "https://www.google.com", Instant.now()));
		repository.save(new Bookmark(null, "vmsBookmark7", "https://www.google.com", Instant.now()));
		repository.save(new Bookmark(null, "vmsBookmark8", "https://www.google.com", Instant.now()));
		repository.save(new Bookmark(null, "vmsBookmark9", "https://www.google.com", Instant.now()));
		repository.save(new Bookmark(null, "vmsBookmark10", "https://www.google.com", Instant.now()));
		repository.save(new Bookmark(null, "vmsBookmark11", "https://www.google.com", Instant.now()));
		repository.save(new Bookmark(null, "vmsBookmark12", "https://www.google.com", Instant.now()));
		repository.save(new Bookmark(null, "vmsBookmark13", "https://www.google.com", Instant.now()));
		repository.save(new Bookmark(null, "vmsBookmark14", "https://www.google.com", Instant.now()));
		repository.save(new Bookmark(null, "vmsBookmark15", "https://www.google.com", Instant.now()));
	}

}
