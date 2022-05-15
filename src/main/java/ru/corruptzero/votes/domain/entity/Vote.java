package ru.corruptzero.votes.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "votes")
public class Vote {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long userId;

    @Column(updatable = false)
    private VoteValue voteValue;

}
