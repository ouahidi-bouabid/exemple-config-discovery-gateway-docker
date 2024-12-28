package com.ouahidi.clientservice.repositories;

import com.ouahidi.clientservice.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
