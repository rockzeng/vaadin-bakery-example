package com.gmail.shumilin2604.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.shumilin2604.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
