package edu.RL.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class TrainerEntity {
    @Id
    private String trainerId;
    private String name;
    private String address;
    private double salary;
    private String phoneNumber;
    private String email;
    private LocalDate dob;
    private int experiencesYear;
    private String qualification;
}
