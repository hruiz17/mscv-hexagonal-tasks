package com.hexagonal.mscv_hexagonal_tasks.domain.ports.in;

import com.hexagonal.mscv_hexagonal_tasks.domain.models.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
