package com.ski.skiresort.service;

import com.ski.skiresort.dao.CoachRepository;

import com.ski.skiresort.domain.entity.Coach;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CoachServiceImpl implements CoachService {
    private final CoachRepository coachRepository;



    @Override
    public List<Coach> findAll() {
        return coachRepository.findAll();
    }

    @Override
    public Coach save(Coach theCoach) {
        return coachRepository.save(theCoach);
    }

    @Override
    public void deleteById(long theId) {
        coachRepository.deleteById(theId);
    }

    @Override
    public Coach findById(long theId) {
        Optional<Coach> result = coachRepository.findById(theId);
        Coach theCoach;
        if (result.isPresent()) {
            theCoach = result.get();
        } else {
            throw new RuntimeException("Didnt find coach with id" + theId);
        }
        return theCoach;
    }
}
