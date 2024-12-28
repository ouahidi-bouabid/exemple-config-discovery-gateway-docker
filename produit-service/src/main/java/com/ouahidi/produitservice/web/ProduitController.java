package com.ouahidi.produitservice.web;

import com.ouahidi.produitservice.entities.Produit;
import com.ouahidi.produitservice.repositories.ProduitRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ProduitController {

    public ProduitController(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    private ProduitRepository produitRepository;


    @GetMapping("/produits")
    public List<Produit> allProduit() {
        return produitRepository.findAll();
    }
        @GetMapping("/produits/{id}")
        public Produit aProduit(@PathVariable Long id){
            return  produitRepository.findById(id).get();

        }
}
