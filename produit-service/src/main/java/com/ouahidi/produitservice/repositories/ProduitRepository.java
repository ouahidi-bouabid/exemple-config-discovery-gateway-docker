package com.ouahidi.produitservice.repositories;

import com.ouahidi.produitservice.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;


//@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
