package net.savantly.garden.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import net.savantly.sprout.wiki.WikiModule;

@SpringBootApplication
@Import(WikiModule.class)
public class GardenWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GardenWebApplication.class, args);
	}
}
