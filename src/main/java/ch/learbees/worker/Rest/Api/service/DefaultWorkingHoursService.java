package ch.learbees.worker.Rest.Api.service;

import ch.learbees.worker.Rest.Api.controller.model.WorkingHours;
import ch.learbees.worker.Rest.Api.persistency.entity.WorkingHoursEntity;
import ch.learbees.worker.Rest.Api.persistency.repository.WorkingHoursRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultWorkingHoursService implements WorkingHoursService {

    private final WorkingHoursRepository workingHoursRepository;

    public DefaultWorkingHoursService(WorkingHoursRepository workingHoursRepository) {
        this.workingHoursRepository = workingHoursRepository;
    }

    @Override
    public List<WorkingHoursEntity> getWorkingHoursList(){
        return (List<WorkingHoursEntity>) workingHoursRepository.findAll();
    }

    @Override
    public WorkingHoursEntity createWorkingHours(WorkingHours workingHours){
        return workingHoursRepository.save(new WorkingHoursEntity());
    }
}
