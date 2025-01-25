package com.malem.listwave.resource;

import com.malem.listwave.entities.Task;
import com.malem.listwave.service.ToDoListService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/list")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ToDoListController
{

    @Inject
    private ToDoListService toDoListService;



    @PUT
    @Path("/{id}")
    public Response updateTask(@PathParam("id") Long id, Task task)
    {
        Task update = toDoListService.updateTask(id, task);

        if (update == null) { return Response.status(Response.Status.NOT_FOUND).build(); }

        return Response.ok().build();
    }

    @POST
    public Response createTask(Task task){

        Task createdTask = toDoListService.createTask(task);
        return Response.status(Response.Status.CREATED).entity(createdTask).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteTask(@PathParam("id") Long id){

        boolean isDeleted = toDoListService.deleteTask(id);
        if (isDeleted) { return Response.status(Response.Status.NOT_FOUND).build(); }

        return Response.noContent().build();
    }

    @GET
    @Path("/{id}")
    public Response getTasks(@PathParam("id") Long id){
        Task task = toDoListService.getTask(id);
        if (task == null) { Response.status(Response.Status.NOT_FOUND).build(); }

        return Response.ok(task).build();

    }

    @GET
    public List<Task> getAllTasks(){
        return toDoListService.getToDoList();
    }


}