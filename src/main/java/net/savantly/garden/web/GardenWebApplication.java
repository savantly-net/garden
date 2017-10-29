package net.savantly.garden.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.savantly.sprout.autoconfigure.EnableSprout;

@EnableSprout
@SpringBootApplication
public class GardenWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GardenWebApplication.class, args);
	}
}
