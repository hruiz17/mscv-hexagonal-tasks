package com.hexagonal.mscv_hexagonal_tasks.domain.ports.in;

public interface DeleteTaskUseCase {
    boolean deleteTask(Long id);
}
