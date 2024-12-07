package com.hexagonal.mscv_hexagonal_tasks.application.usecases;

import com.hexagonal.mscv_hexagonal_tasks.domain.models.AdditionalTaskInfo;
import com.hexagonal.mscv_hexagonal_tasks.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.hexagonal.mscv_hexagonal_tasks.domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }
}
