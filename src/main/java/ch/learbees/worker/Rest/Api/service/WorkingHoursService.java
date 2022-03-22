package ch.learbees.worker.Rest.Api.service;

import ch.learbees.worker.Rest.Api.controller.model.WorkingHours;
import ch.learbees.worker.Rest.Api.persistency.entity.WorkingHoursEntity;

import java.util.List;

public interface WorkingHoursService {

    List<WorkingHoursEntity> getWorkingHoursList();

    WorkingHoursEntity createWorkingHours(WorkingHours workingHours);
}
