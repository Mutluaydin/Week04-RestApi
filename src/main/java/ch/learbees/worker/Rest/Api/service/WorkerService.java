package ch.learbees.worker.Rest.Api.service;

import ch.learbees.worker.Rest.Api.controller.model.Worker;
import ch.learbees.worker.Rest.Api.persistency.entity.WorkerEntity;

import java.util.List;

public interface WorkerService {

    WorkerEntity createWorker(Worker worker);

    void deleteWorker(Long id);

    List<WorkerEntity> getListOfWorkers();

    WorkerEntity findWorker(Long id);

}
