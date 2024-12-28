package com.ouahidi.commandesevice.web;

import com.ouahidi.commandesevice.modele.Client;


import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Component
@FeignClient(name="CLIENT-SERVICE")
public interface ClientOpenFeing {
@GetMapping("/clients")
    public List<Client> findAll();
@GetMapping("/clients/{id}")
public Client findById(@PathVariable Long id)
;
    }


