package com.ouahidi.produitservice.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

// On lui dit de chercher les paramètres globaux

@ConfigurationProperties(prefix = "global.params")

@Getter
@Setter
//@RefreshScope
@AllArgsConstructor
@NoArgsConstructor
public class ConfigGlobalProduit {
int g1;
int g2;

}

