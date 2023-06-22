package com.example.todolist1.dao;

import com.example.todolist1.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoDao extends JpaRepository<ToDo,Integer> {
}
