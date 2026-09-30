package com.jt.to_do_app;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class Taskservice {

    private final TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task addTask(Task task){
        return taskRepository.save(task);
    }

    public Task getTaskById(int id){
        return taskRepository.findById(id).orElseThrow(()->new RuntimeException("no id found"));
    }

    public void deleteTaskById(int id){
        getTaskById(id);
        taskRepository.deleteById(id);
    }

    public Task updateTask(Task task){
        getTaskById(task.getId());
        return taskRepository.save(task);
    }
}
