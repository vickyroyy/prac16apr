package com.amzdemoo.de;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.*;

@SpringBootApplication
public class DeApplication implements CommandLineRunner {
	public static final Logger Logger= LoggerFactory.getLogger(DeApplication.class);

	public static void main(String[] args) {
		Logger.info("its a CI pipeline job");
		SpringApplication.run(DeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Logger.info("Vicky Roy");
		
	}

}