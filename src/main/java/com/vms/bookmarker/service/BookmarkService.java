package com.vms.bookmarker.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
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
	public List<Bookmark> getbookmarks(Integer page) {
		int pageNo = page < 1 ? 0 : page - 1;
		PageRequest pageRequest = PageRequest.of(pageNo, 10, Direction.DESC, "createdAt");
		return repository.findAll(pageRequest).getContent();
	}

}
