package br.com.chagas.todolist.service;

import br.com.chagas.todolist.dto.TodoListDto;

import java.util.List;

public interface TodoService {

    List<TodoListDto> getTodoList();
}
