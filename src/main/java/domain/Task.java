package domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "task", schema = "todo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taskId;

    @Column
    private String description;

    @Enumerated(EnumType.ORDINAL)
    private Status status;
}
