package com.vms.bookmarker.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vms.bookmarker.dao.BookmarkRepository;
import com.vms.bookmarker.entity.Bookmark;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {

	private final BookmarkRepository repository;

	@Transactional(readOnly = true)
	public List<Bookmark> getbookmarks() {
		return repository.findAll();
	}

}
