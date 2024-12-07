package com.hexagonal.mscv_hexagonal_tasks.domain.ports.out;

import com.hexagonal.mscv_hexagonal_tasks.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
