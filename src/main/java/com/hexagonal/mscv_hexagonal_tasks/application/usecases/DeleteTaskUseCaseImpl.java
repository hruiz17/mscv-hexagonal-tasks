package com.hexagonal.mscv_hexagonal_tasks.application.usecases;

import com.hexagonal.mscv_hexagonal_tasks.domain.ports.in.DeleteTaskUseCase;
import com.hexagonal.mscv_hexagonal_tasks.domain.ports.out.TaskRepositoryPort;

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public DeleteTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteTask(Long id) {
        return taskRepositoryPort.deleteById(id);
    }
}
