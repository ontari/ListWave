package com.malem.listwave.service;


import com.malem.listwave.entities.Task;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@ApplicationScoped
public class ToDoListService
{
    private final Map<Long,Task> toDoList = new HashMap<>();
    private final AtomicLong nextId = new AtomicLong(1);

    public Task createTask(Task task){

        Long id = nextId.getAndIncrement();

        task.setId(id);
        toDoList.put(id,task);

        return task;
    }

    public Task updateTask(Long id, Task updatetask){

        Task currentTask = toDoList.get(id);

        if (currentTask != null){
            currentTask.setDescription(updatetask.getDescription());
            currentTask.setStatus(updatetask.getStatus());
            toDoList.put(id,currentTask);
        }

        return currentTask;
    }

    public boolean deleteTask(Long id){
        return toDoList.remove(id) != null;
    }

    public boolean deleteAllTasks()
    {
        toDoList.clear();

        return toDoList.isEmpty();
    }

    public List<Task> getToDoList(){
        return new ArrayList<>(toDoList.values());
    }

    public Task getTask(Long id){
        return toDoList.get(id);
    }



}
