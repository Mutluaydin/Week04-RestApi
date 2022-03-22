package ch.learbees.worker.Rest.Api.persistency.entity;

import javax.persistence.*;

@Entity
public class WorkingHoursEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private int weekNumber;
    private int hours;
    @ManyToOne
    private WorkerEntity worker;

    public WorkingHoursEntity(){}

    public WorkingHoursEntity(int weekNumber, int hours) {
        this.weekNumber = weekNumber;
        this.hours = hours;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


}
