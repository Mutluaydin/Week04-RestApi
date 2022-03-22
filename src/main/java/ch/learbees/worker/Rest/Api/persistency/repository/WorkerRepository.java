package ch.learbees.worker.Rest.Api.persistency.repository;

import ch.learbees.worker.Rest.Api.persistency.entity.WorkerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface WorkerRepository extends CrudRepository<WorkerEntity, Long> {


}
