package ch.learbees.worker.Rest.Api.service;

import ch.learbees.worker.Rest.Api.controller.model.Worker;
import ch.learbees.worker.Rest.Api.persistency.entity.WorkerEntity;
import ch.learbees.worker.Rest.Api.persistency.repository.WorkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultWorkerService implements WorkerService {

    private final WorkerRepository workerRepository;

    public DefaultWorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @Override
    public List<WorkerEntity> getListOfWorkers() {
        return (List<WorkerEntity>) this.workerRepository.findAll();
    }

    @Override
    public WorkerEntity findWorker(Long id) {
        return this.workerRepository.findById(id).get();
    }

    @Override
    public WorkerEntity createWorker(Worker worker) {
        return this.workerRepository.save(new WorkerEntity());
    }

    @Override
    public void deleteWorker(Long id) {
        this.workerRepository.deleteById(id);
    }




}
