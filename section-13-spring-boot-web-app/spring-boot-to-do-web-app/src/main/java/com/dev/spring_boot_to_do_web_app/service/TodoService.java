package com.dev.spring_boot_to_do_web_app.service;

import com.dev.spring_boot_to_do_web_app.model.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static final List<Todo> todos = new ArrayList<>();

    static {

        todos.add(new Todo(101, "dev",
                "Learn AWS", LocalDate.now().plusYears(3), false));
        todos.add(new Todo(102, "dev",
                "Learn Azure", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(103, "dev",
                "Learn Java", LocalDate.now().plusYears(1), false));
    }

    public TodoService() {
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
