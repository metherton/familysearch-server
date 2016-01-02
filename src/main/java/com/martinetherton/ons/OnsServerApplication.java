package com.martinetherton.ons;

import org.familysearch.api.client.ft.FamilySearchFamilyTree;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnsServerApplication {

    @Bean
    public FamilySearchFamilyTree familySearchFamilyTree() {
        return new FamilySearchFamilyTree(true);
    }

    public static void main(String[] args) {
        SpringApplication.run(OnsServerApplication.class, args);
    }
}
