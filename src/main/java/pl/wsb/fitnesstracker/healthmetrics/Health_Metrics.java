package pl.wsb.fitnesstracker.healthmetrics;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "health_metrics")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Health_Metrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable

    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private String user_id;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "weight", nullable = false)
    private Integer weight;

    @Column(name = "height", nullable = false)
    private Integer height;

    @Column(name = "heartRate", nullable = false)
    private Integer heartRate;

    public Health_Metrics(
            final Long id,
            final String user_id,
            final String date,
            final Integer weight,
            final Integer height,
            final Integer heartRate
    ) {

        this.id = id;
        this.user_id = user_id;
        this.date = date;
        this.weight = weight;
        this.height = height;
        this.heartRate = heartRate;
    }

}
