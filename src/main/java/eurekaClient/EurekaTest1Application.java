package eurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaTest1Application.class, args);
	}
}
