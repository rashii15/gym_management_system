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
public class PaymentEntity {
    @Id
    private String paymentId;
    private double amount;
    private LocalDate payDate;
}
