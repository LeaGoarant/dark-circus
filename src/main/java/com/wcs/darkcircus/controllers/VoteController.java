package com.wcs.darkcircus.controllers;

import com.wcs.darkcircus.entities.Vote;
import com.wcs.darkcircus.repositories.VoteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class VoteController{

    @Autowired
    private VoteRepository voteRepository;

    @PostMapping("/vote")
    public String store(Vote vote){
        vote = voteRepository.save(vote);
        return "redirect:/tour";
    }
}