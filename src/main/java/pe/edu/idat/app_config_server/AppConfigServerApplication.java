package pe.edu.idat.app_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AppConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppConfigServerApplication.class, args);
	}

}
