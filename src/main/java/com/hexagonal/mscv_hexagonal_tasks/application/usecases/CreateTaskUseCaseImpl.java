package com.hexagonal.mscv_hexagonal_tasks.application.usecases;

import com.hexagonal.mscv_hexagonal_tasks.domain.models.Task;
import com.hexagonal.mscv_hexagonal_tasks.domain.ports.in.CreateTaskUseCase;
import com.hexagonal.mscv_hexagonal_tasks.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
