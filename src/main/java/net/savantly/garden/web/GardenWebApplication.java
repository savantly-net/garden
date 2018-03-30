package net.savantly.garden.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import net.savantly.sprout.wiki.WikiModule;

@SpringBootApplication
public class GardenWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GardenWebApplication.class, args);
	}
	
	@Configuration
	@Import(WikiModule.class)
	class GardenConfiguration {
		
	}
}
