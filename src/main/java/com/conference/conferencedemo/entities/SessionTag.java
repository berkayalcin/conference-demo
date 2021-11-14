package com.conference.conferencedemo.entities;

import lombok.*;

import javax.persistence.Embeddable;

@Getter
@Embeddable
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SessionTag {
    private String tag_name;
}
