package com.hexagonal.mscv_hexagonal_tasks.domain.ports.out;

import com.hexagonal.mscv_hexagonal_tasks.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort {
    Task save(Task task);
    Optional<Task> findById(Long id);
    List<Task> findAll();
    Optional<Task> update(Task task);
    boolean deleteById(Long id);
}
