package ch.learbees.worker.Rest.Api.persistency.entity;

import ch.learbees.worker.Rest.Api.controller.model.WorkerType;

import javax.persistence.*;
import java.util.List;


@Entity
public class WorkerEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private WorkerType workerType;

    @OneToMany(mappedBy = "worker")
    private List<WorkingHoursEntity> workingHours;


    public WorkerEntity(){}

    public WorkerEntity(String firstName, String lastName, WorkerType workerType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workerType = workerType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public WorkerType getWorkerType() {
        return workerType;
    }

    public void setWorkerType(WorkerType workerType) {
        this.workerType = workerType;
    }


}
