package de.claudioaltamura.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URISyntaxException;

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        SpringApplication.run(Application.class, args);
	}

	@Bean
    public RestTemplate restTemplate() {
	    return new RestTemplate();
	}

}
