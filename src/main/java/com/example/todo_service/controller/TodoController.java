package com.example.todo_service.controller;

import com.example.todo_service.model.Todo;
import com.example.todo_service.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoController {
  private final TodoService todoService;

  @PostMapping
  public Todo createTodo(@RequestBody Todo todo) {
    return todoService.createTodo(todo);
  }

  @GetMapping
  public List<Todo> getTodosByUser(@RequestParam String user) {
    return todoService.getTodosByUser(user);
  }
}
