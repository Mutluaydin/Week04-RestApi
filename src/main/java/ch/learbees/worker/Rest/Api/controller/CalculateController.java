package ch.learbees.worker.Rest.Api.controller;

import ch.learbees.worker.Rest.Api.service.CalculateService;
import ch.learbees.worker.Rest.Api.service.WorkingHoursService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculates")
public class CalculateController {

    private CalculateService calculateService;
    private WorkingHoursService workingHoursService;


    public CalculateController(CalculateService calculateService, WorkingHoursService workingHoursService) {
        this.calculateService = calculateService;
        this.workingHoursService = workingHoursService;
    }



}
