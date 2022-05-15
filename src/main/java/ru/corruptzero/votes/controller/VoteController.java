package ru.corruptzero.votes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.corruptzero.votes.domain.entity.Vote;
import ru.corruptzero.votes.payload.SaveVoteRequest;
import ru.corruptzero.votes.payload.SaveVoteResponse;
import ru.corruptzero.votes.service.VoteService;

@RestController
public class VoteController {
    @Autowired
    private VoteService service;


    @PostMapping("/votes")
    SaveVoteResponse saveVoteResponse(@RequestBody SaveVoteRequest saveVoteRequest){
        Vote vote = new Vote();
        vote.setUserId(saveVoteRequest.getUserId());
        vote.setVoteValue(saveVoteRequest.getVoteValue());

        boolean isSaved = service.save(vote);

        SaveVoteResponse saveVoteResponse = new SaveVoteResponse();
        saveVoteResponse.setSaved(isSaved);
        return saveVoteResponse;
    }
}

