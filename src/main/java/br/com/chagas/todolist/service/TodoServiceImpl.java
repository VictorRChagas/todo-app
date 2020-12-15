package br.com.chagas.todolist.service;

import br.com.chagas.todolist.repository.TodoRepository;
import br.com.chagas.todolist.converter.TodoListConverter;
import br.com.chagas.todolist.dto.TodoListDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TodoServiceImpl implements TodoService {

    private TodoListConverter todoListConverter;
    private TodoRepository todoRepository;

    public TodoServiceImpl(TodoListConverter todoListConverter, TodoRepository todoRepository) {
        this.todoListConverter = todoListConverter;
        this.todoRepository = todoRepository;
    }

    public List<TodoListDto> getTodoList() {
        return StreamSupport.stream(todoRepository.findAll().spliterator(), false)
                .map(todoListConverter::convert)
                .collect(Collectors.toList());
    }
}
