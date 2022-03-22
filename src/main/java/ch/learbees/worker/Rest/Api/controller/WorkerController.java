package ch.learbees.worker.Rest.Api.controller;

import ch.learbees.worker.Rest.Api.controller.model.Worker;
import ch.learbees.worker.Rest.Api.persistency.entity.WorkerEntity;
import ch.learbees.worker.Rest.Api.service.WorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    private WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping()
    public ResponseEntity<List<WorkerEntity>> getListOfWorkers(){
        System.out.println("get list of worker!");
        List<WorkerEntity> workerEntityList = this.workerService.getListOfWorkers();

        return ResponseEntity.status(HttpStatus.OK).body(workerEntityList);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<WorkerEntity> getWorkerById(@PathVariable ("id") Long id){
        System.out.println("get a worker by his/her id");
        WorkerEntity workerEntity = this.workerService.findWorker(id);

        return ResponseEntity.status(HttpStatus.OK).body(workerEntity);

    }

    @PostMapping()
    public ResponseEntity createWorker(@RequestBody Worker worker){
        System.out.println("create a new Worker" + worker);
        WorkerEntity workerEntity = this.workerService.createWorker(worker);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(workerEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteWorkerById(@PathVariable("id") Long id ){
        System.out.println("delete Worker!" );
        this.workerService.deleteWorker(id);

        return  ResponseEntity.status(HttpStatus.OK).build();
    }
}
