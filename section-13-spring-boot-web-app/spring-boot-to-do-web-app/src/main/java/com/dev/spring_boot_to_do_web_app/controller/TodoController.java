package com.dev.spring_boot_to_do_web_app.controller;

import com.dev.spring_boot_to_do_web_app.model.Todo;
import com.dev.spring_boot_to_do_web_app.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String listAllTodos(@ModelAttribute("name") String name, ModelMap model) {

        List<Todo> todos = todoService.findByUsername("test");
        model.addAttribute("todos", todos);

        return "listTodos";
    }

}
