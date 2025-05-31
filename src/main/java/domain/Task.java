package domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "task", schema = "todo")
public class Task {
    @Id
    @Column(name = "id")
    private int taskId;

    @Column
    private String description;

    @Column
    private Status status;
}
