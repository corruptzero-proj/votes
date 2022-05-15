package ru.corruptzero.votes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.corruptzero.votes.domain.entity.Vote;
import ru.corruptzero.votes.domain.repository.VoteRepository;

@Service
public class VoteService {
    @Autowired
    VoteRepository repository;

    public boolean save(Vote vote){
        if(repository.existsByUserId(vote.getUserId())){
            return false;
        }
        repository.save(vote);
        return true;

    }
}
