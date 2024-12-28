package com.ouahidi.clientservice;

import com.ouahidi.clientservice.entities.Client;
import com.ouahidi.clientservice.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableDiscoveryClient

public class ClientServiceApplication {

    private final ClientRepository clientRepository;

    public ClientServiceApplication(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }
@Bean
    CommandLineRunner start(ClientServiceApplication clientServiceApplication)
    { return args -> {
        Client cl1=Client.builder()
                .age(30)
                .nom("Sara")
                .ville("Rabat")
                .build();
        clientRepository.save(cl1);

        Client cl2=Client.builder()
                .age(24)
                .nom("Hajar")
                .ville("Meknes")
                .build();
        clientRepository.save(cl2);
        Client cl3=Client.builder()
                .age(19)
                .nom("Mohamed")
                .ville("Azrou")
                .build();
        clientRepository.save(cl3);

        Client c =clientRepository.findById(2L).get();
        System.out.println("Nom "+c.getNom());


    };

    }
}
