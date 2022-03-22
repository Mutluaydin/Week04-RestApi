package ch.learbees.worker.Rest.Api.service;

import ch.learbees.worker.Rest.Api.persistency.entity.WorkingHoursEntity;

import java.util.List;

public interface CalculateService {
    Double calculateCurrentCost(List<WorkingHoursEntity> workingHoursEntityList);
}
