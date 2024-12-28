package com.ouahidi.produitservice.web;

import com.ouahidi.produitservice.config.ConfigGlobalProduit;
import com.ouahidi.produitservice.config.ProduitConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
//@RefreshScope
public class ControllerTestConfig {
   /* @Value("${global.params.g1}")
    private int g1;
    @Value("${global.params.g2}")
    private int g2;

    @Value("${produit.params.p1}")
    private int p1;
    @Value("${produit.params.p2}")
    private int p2;

    */

    private ConfigGlobalProduit globalProduit;

    private ProduitConfig produitConfig;



    public ControllerTestConfig(ConfigGlobalProduit globalProduit, ProduitConfig produitConfig) {
        this.globalProduit = globalProduit;
        this.produitConfig = produitConfig;
    }


    // Le deuxième cas on injecte
/*
    @GetMapping("/configTest")
public Map<String, Integer>  configTest()
{ return Map.of("g1",g1, "g2",g2, "p1",p1, "p2",p2);}
*/
    @GetMapping("/testGlobal")
    public ConfigGlobalProduit testGlobal(){
        return globalProduit;
    }
    @GetMapping("/produitConfig")
    public ProduitConfig testProduitConfig()
    { return produitConfig;}
}




