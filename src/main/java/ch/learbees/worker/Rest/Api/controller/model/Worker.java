package ch.learbees.worker.Rest.Api.controller.model;

import java.util.List;

public class Worker {
    private String firstName;
    private String lastName;
    private WorkerType workerType;
    private List<WorkingHours> workingHours;

    public Worker(){}

    public Worker(String firstName, String lastName, WorkerType workerType, List<WorkingHours> workingHours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workerType = workerType;
        this.workingHours = workingHours;
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

    public List<WorkingHours> getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(List<WorkingHours> workingHours) {
        this.workingHours = workingHours;
    }
}
