package ch.learbees.worker.Rest.Api.controller.model;

public class WorkingHours {
    private int weekNumber;
    private int hours;
    private Worker worker;

    public WorkingHours(){};

    public WorkingHours(int weekNumber, int hours, Worker worker) {
        this.weekNumber = weekNumber;
        this.hours = hours;
        this.worker = worker;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }
}
