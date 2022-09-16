package com.vms.bookmarker.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vms.bookmarker.dao.BookmarkRepository;
import com.vms.bookmarker.dto.BookmarkDTO;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {

	private final BookmarkRepository repository;

	@Transactional(readOnly = true)
	public BookmarkDTO getbookmarks(Integer page) {
		int pageNo = page < 1 ? 0 : page - 1;
		PageRequest pageRequest = PageRequest.of(pageNo, 10, Direction.DESC, "createdAt");
		return new BookmarkDTO(repository.findAll(pageRequest));
	}

}
