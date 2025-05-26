package com.github.pdiazzdev.arquiteturaspring.todos;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
    boolean existsByDescricao(String descricao);
}
