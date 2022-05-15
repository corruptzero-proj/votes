package ru.corruptzero.votes.payload;

import lombok.Getter;
import lombok.Setter;
import ru.corruptzero.votes.domain.entity.VoteValue;

import java.util.UUID;

@Getter
@Setter
public class SaveVoteRequest {

    private Long userId;

    private VoteValue voteValue;
}
