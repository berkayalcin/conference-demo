package com.conference.conferencedemo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity(name = "sessions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@SecondaryTable(name = "session_budgets", pkJoinColumns = @PrimaryKeyJoinColumn(name = "session_id"))
@SecondaryTable(name = "session_tags", pkJoinColumns = @PrimaryKeyJoinColumn(name = "session_id"))
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long session_id;
    private String session_name;
    private String session_description;
    private Integer session_length;

    @Column(name = "budget", table = "session_budgets")
    private BigDecimal session_budget;

    @ManyToMany
    @JoinTable(name = "session_speakers", joinColumns = @JoinColumn(name = "session_id"), inverseJoinColumns = @JoinColumn(name = "speaker_id"))
    private List<Speaker> speakers;

    @Embedded
    private SessionTag session_tag;
}
