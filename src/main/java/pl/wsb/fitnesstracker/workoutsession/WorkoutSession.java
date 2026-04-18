package pl.wsb.fitnesstracker.workoutsession;

import jakarta.persistence.*;
import pl.wsb.fitnesstracker.training.api.Training;

import java.time.LocalDateTime;

@Entity
public class WorkoutSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double startLatitude;
    private double startLongitude;

    private double endLatitude;
    private double endLongitude;

    private double altitude;

    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "training_id")
    private Training training;

    // gettery i settery
}