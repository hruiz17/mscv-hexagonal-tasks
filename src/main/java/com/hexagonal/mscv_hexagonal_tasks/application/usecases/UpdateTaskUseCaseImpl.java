package com.hexagonal.mscv_hexagonal_tasks.application.usecases;

import com.hexagonal.mscv_hexagonal_tasks.domain.models.Task;
import com.hexagonal.mscv_hexagonal_tasks.domain.ports.in.UpdateTaskUseCase;
import com.hexagonal.mscv_hexagonal_tasks.domain.ports.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }
}