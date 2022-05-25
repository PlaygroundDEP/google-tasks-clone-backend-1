package lk.ijse.dep8.tasks.dao;

import lk.ijse.dep8.tasks.entity.Task;

import java.util.List;
import java.util.Optional;

public interface TaskDAO {

    public boolean existsTaskById(int taskId);

    public Task saveTask(Task task);

    public void deleteTaskById(int taskId);

    public Optional<Task> findTaskById(int taskId);

    public List<Task> findAllTasks();

    public long countTasks();
}
