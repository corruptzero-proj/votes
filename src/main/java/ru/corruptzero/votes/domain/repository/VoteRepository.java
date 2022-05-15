package ru.corruptzero.votes.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.corruptzero.votes.domain.entity.Vote;


public interface VoteRepository extends JpaRepository<Vote, Long> {
    boolean existsByUserId(Long userId);
}
