package com.conference.conferencedemo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity(name = "session_tags")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SessionTag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long session_tag_id;
    private String tag_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Session session;
}
