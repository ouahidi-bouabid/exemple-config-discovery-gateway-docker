package com.ouahidi.commandesevice;

import com.ouahidi.commandesevice.entities.Commande;
import com.ouahidi.commandesevice.repositories.CommandeRepositoriy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

@EnableFeignClients
//@EnableDiscoveryClient


public class CommandeSeviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandeSeviceApplication.class, args);
    }
@Bean
    CommandLineRunner start(CommandeRepositoriy commandeRepositoriy){

        return args -> {

            Commande cm1 = Commande.builder()
                    .idClient(1L)
                    .idProduit(2L)
                    .quantite(30)
                    .build();
            commandeRepositoriy.save(cm1);

            Commande cm2 = Commande.builder()
                    .idClient(1L)
                    .idProduit(2L)
                    .quantite(30)
                    .build();
            commandeRepositoriy.save(cm2);
            Commande cm3 = Commande.builder()
                    .idClient(1L)
                    .idProduit(1L)
                    .quantite(5)
                    .build();
            commandeRepositoriy.save(cm3);

            Commande cm4 = Commande.builder()
                    .idClient(2L)
                    .idProduit(2L)
                    .quantite(7)
                    .build();
            commandeRepositoriy.save(cm4);

            Commande cm5 = Commande.builder()
                    .idClient(3L)
                    .idProduit(3L)
                    .quantite(10)
                    .build();
            commandeRepositoriy.save(cm5);

        };
    }

}
