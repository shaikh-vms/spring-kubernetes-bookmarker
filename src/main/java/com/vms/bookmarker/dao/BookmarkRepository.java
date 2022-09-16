package com.vms.bookmarker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vms.bookmarker.entity.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

}
