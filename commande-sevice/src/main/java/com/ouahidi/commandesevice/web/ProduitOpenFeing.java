package com.ouahidi.commandesevice.web;


import com.ouahidi.commandesevice.modele.Produit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

//@Component
@FeignClient(name="PRODUIT-SERVICE")
public interface ProduitOpenFeing {

@GetMapping("/produits")
    public List<Produit> findAll();

@GetMapping("/produits/{id}")
public Produit findById(@PathVariable Long id)
;
    }


