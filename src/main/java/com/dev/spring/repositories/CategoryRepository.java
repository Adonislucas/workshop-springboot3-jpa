package com.dev.spring.repositories;

import com.dev.spring.entities.Category;
import com.dev.spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
