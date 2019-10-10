package com.wcs.darkcircus.controllers;

import com.wcs.darkcircus.entities.Reservation;
import com.wcs.darkcircus.repositories.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservationController{

    @Autowired
    private ReservationRepository reservationRepository;

    @PostMapping("/reservation")
    public String store(Reservation reservation){
        reservation = reservationRepository.save(reservation);
        return "redirect:/tour";
    }
}