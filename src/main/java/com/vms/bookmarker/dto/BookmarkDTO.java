package com.vms.bookmarker.dto;

import java.util.List;

import org.springframework.data.domain.Page;

import com.vms.bookmarker.entity.Bookmark;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookmarkDTO {

	private List<Bookmark> data;
	private int totalElements;
	private int totalPages;
	private int currentPage;
	private boolean isFirst;
	private boolean isLast;
	private boolean hasNext;
	private boolean hasPrevious;

	public BookmarkDTO(Page<Bookmark> page) {
		this.setData(page.getContent());
		this.setTotalElements(page.getNumberOfElements());
		this.setTotalPages(page.getTotalPages());
		this.setCurrentPage(page.getNumber());
		this.setFirst(page.isFirst());
		this.setLast(page.isLast());
		this.setHasNext(page.hasNext());
		this.setHasPrevious(page.hasPrevious());
	}
}
