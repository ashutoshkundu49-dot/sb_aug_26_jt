package com.jt.to_do_app;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final Taskservice taskservice;


    @GetMapping
    public List<Task> getAllTasks(){
        return taskservice.getAllTasks();
    }


    @PostMapping
    public Task addTasks(@RequestBody Task task)
    {
        return taskservice.addTask(task);
    }


    @GetMapping("/{id}")
    public Task getTaskByIds(@PathVariable int id){
        return taskservice.getTaskById(id);
    }


    @PutMapping
    public Task updateTasks(@RequestBody Task task){
        return taskservice.updateTask(task);
    }


    @DeleteMapping("/{id}")
    public void deleteTaskByIds(@PathVariable int id){
        taskservice.deleteTaskById(id);
    }
}
