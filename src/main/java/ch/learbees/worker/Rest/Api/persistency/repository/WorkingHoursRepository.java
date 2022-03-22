package ch.learbees.worker.Rest.Api.persistency.repository;

import ch.learbees.worker.Rest.Api.persistency.entity.WorkingHoursEntity;
import org.springframework.data.repository.CrudRepository;

public interface WorkingHoursRepository extends CrudRepository<WorkingHoursEntity, Long> {
}
