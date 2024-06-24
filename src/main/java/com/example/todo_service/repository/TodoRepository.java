package com.example.todo_service.repository;

import com.example.todo_service.model.Todo;
import io.hypersistence.utils.spring.repository.BaseJpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TodoRepository extends BaseJpaRepository<Todo, UUID>,
    ListPagingAndSortingRepository<Todo, UUID>, JpaSpecificationExecutor<Todo> {
  List<Todo> findAllByUserId(UUID id);
}
