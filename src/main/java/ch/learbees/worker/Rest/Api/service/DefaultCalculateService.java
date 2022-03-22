package ch.learbees.worker.Rest.Api.service;


import ch.learbees.worker.Rest.Api.controller.model.WorkerType;
import ch.learbees.worker.Rest.Api.persistency.entity.WorkingHoursEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DefaultCalculateService implements CalculateService {

    @Override
    public Double calculateCurrentCost(List<WorkingHoursEntity> workingHoursEntityList){
        double totalWorkingHours = 0;
        for (int i = 0; i < workingHoursEntityList.size(); i++){
            WorkerType workerType = null;
            switch (workerType){
                case DISABLED_WORKER:
                case CHILD_WORKER:
                    totalWorkingHours += workingHoursEntityList.get(i).getHours() * 10;
                    break;
                case LAZY_WORKER:
                    totalWorkingHours += workingHoursEntityList.get(i).getHours() * 23;
                    break;
                case GOOD_WORKER:
                    totalWorkingHours += workingHoursEntityList.get(i).getHours() * 40;
                    break;
            }
        }
        return totalWorkingHours;
    }


}
