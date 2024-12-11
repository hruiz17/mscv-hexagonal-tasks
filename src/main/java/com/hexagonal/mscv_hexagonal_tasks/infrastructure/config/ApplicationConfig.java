package com.hexagonal.mscv_hexagonal_tasks.infrastructure.config;

import com.hexagonal.mscv_hexagonal_tasks.application.services.TaskService;
import com.hexagonal.mscv_hexagonal_tasks.application.usecases.*;
import com.hexagonal.mscv_hexagonal_tasks.domain.models.Task;
import com.hexagonal.mscv_hexagonal_tasks.domain.ports.in.CreateTaskUseCase;
import com.hexagonal.mscv_hexagonal_tasks.domain.ports.in.DeleteTaskUseCase;
import com.hexagonal.mscv_hexagonal_tasks.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.hexagonal.mscv_hexagonal_tasks.domain.ports.out.ExternalServicePort;
import com.hexagonal.mscv_hexagonal_tasks.domain.ports.out.TaskRepositoryPort;
import com.hexagonal.mscv_hexagonal_tasks.infrastructure.adapters.ExternalServiceAdapter;
import com.hexagonal.mscv_hexagonal_tasks.infrastructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase){
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                new UpdateTaskUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUseCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfoUseCase
        );
    }

    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter){
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort){
        return new GetAdditionalTaskInfoUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort(){
        return new ExternalServiceAdapter();
    }

}
