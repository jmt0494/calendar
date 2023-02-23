package com.joshuataubel.calendar.entities;

import java.time.Instant;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Event {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private Instant dateTime;

    @ManyToMany(mappedBy = "events")
    private List<User> users;

    @OneToOne
    private User owner;

}
