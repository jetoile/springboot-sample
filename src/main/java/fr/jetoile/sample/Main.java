package fr.jetoile.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;

@SpringBootApplication
public class Main {

	@Bean
	public AfterburnerModule afterburnerModule() {
		return new AfterburnerModule();
	}

	@Bean
	public Jdk8Module jdk8Module() {
		return new Jdk8Module();
	}

	@Bean
	public JSR310Module jsr310Module() {
		return new JSR310Module();
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
