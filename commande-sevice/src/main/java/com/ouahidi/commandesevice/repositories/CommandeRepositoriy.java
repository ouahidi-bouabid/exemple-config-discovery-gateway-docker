package com.ouahidi.commandesevice.repositories;

import com.ouahidi.commandesevice.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource
public interface CommandeRepositoriy extends JpaRepository<Commande, Long> {
}
