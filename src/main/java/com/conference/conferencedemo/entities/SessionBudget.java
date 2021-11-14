package com.conference.conferencedemo.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "session_budgets")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SessionBudget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long session_id;
    private BigDecimal budget;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "session_id")
    private Session session;
}
