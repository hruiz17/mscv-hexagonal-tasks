package com.hexagonal.mscv_hexagonal_tasks.domain.ports.in;

import com.hexagonal.mscv_hexagonal_tasks.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updateTask);
}
