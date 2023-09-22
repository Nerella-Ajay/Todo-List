// Write your code here
package com.example.todo.repository;

import com.example.todo.model.Todo;
import java.util.*;

public interface TodoRepository{
    ArrayList<Todo> getTodos();
    Todo getTodoById(int id);
    Todo adTodo(Todo todo);
    Todo updateTod(int id, Todo todo);
    void deleteTodo(int id);
}