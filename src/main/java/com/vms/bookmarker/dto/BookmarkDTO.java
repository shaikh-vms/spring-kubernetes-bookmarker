package com.vms.bookmarker.dto;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vms.bookmarker.entity.Bookmark;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookmarkDTO {

	private List<Bookmark> data;
	private long totalElements;
	private int totalPages;
	private int currentPage;

	@JsonProperty("isFirst")
	private boolean isFirst;

	@JsonProperty("isLast")
	private boolean isLast;

	private boolean hasNext;
	private boolean hasPrevious;

	public BookmarkDTO(Page<Bookmark> page) {
		this.setData(page.getContent());
		this.setTotalElements(page.getTotalElements());
		this.setTotalPages(page.getTotalPages());
		this.setCurrentPage(page.getNumber() + 1);
		this.setFirst(page.isFirst());
		this.setLast(page.isLast());
		this.setHasNext(page.hasNext());
		this.setHasPrevious(page.hasPrevious());
	}
}
