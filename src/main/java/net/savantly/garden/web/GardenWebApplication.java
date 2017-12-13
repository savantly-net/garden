package net.savantly.garden.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import net.savantly.sprout.wiki.WikiModule;

@SpringBootApplication
public class GardenWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GardenWebApplication.class, args);
	}
	
	@Bean
	public WikiModule wikiModule() {
		return new WikiModule();
	}
}
