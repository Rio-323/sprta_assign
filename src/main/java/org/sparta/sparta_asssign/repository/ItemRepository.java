package org.sparta.sparta_asssign.repository;

import org.sparta.sparta_asssign.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {}
