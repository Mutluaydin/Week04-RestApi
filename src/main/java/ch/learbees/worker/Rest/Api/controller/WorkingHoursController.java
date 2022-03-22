package ch.learbees.worker.Rest.Api.controller;

import ch.learbees.worker.Rest.Api.controller.model.WorkingHours;
import ch.learbees.worker.Rest.Api.persistency.entity.WorkingHoursEntity;
import ch.learbees.worker.Rest.Api.service.WorkingHoursService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workingHours")
public class WorkingHoursController {

    private WorkingHoursService workingHoursService;

    public WorkingHoursController(WorkingHoursService workingHoursService) {
        this.workingHoursService = workingHoursService;
    }

    @GetMapping()
    public ResponseEntity <List<WorkingHoursEntity>> getWorkingHoursList(){
        System.out.println("get list of Working Hours");
        List<WorkingHoursEntity> workingHoursEntityList = this.workingHoursService.getWorkingHoursList();

        return ResponseEntity.status(HttpStatus.OK).body(workingHoursEntityList);
    }

    @PostMapping()
    public ResponseEntity createWorkingHours(@RequestBody WorkingHours workingHours){
        System.out.println("create a new Working Hours");
        WorkingHoursEntity workingHoursEntity = this.workingHoursService.createWorkingHours(workingHours);

        return ResponseEntity.status(HttpStatus.CREATED).body(workingHoursEntity);
    }

}
