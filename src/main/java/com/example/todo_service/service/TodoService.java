package com.example.todo_service.service;

import com.example.todo_service.model.Todo;
import com.example.todo_service.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class TodoService {
  private final TodoRepository todoRepository;

  @Transactional
  public Todo createTodo(Todo todo) {
    log.info("createTodo:: {}", todo);
    return todoRepository.merge(todo);
  }

  public List<Todo> getTodosByUser(String user) {
    return todoRepository.findAllByUserId(UUID.fromString(user));
  }
}
