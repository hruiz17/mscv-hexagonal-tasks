package com.hexagonal.mscv_hexagonal_tasks.domain.ports.in;

import com.hexagonal.mscv_hexagonal_tasks.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
