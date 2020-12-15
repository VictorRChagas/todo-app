package br.com.chagas.todolist.controller;

import br.com.chagas.todolist.dto.TodoListDto;
import br.com.chagas.todolist.service.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/fecth-list")
    public List<TodoListDto> getTodoList() {
        return todoService.getTodoList();
    }
}
