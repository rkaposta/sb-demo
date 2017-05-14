package boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={JacksonAutoConfiguration.class})
public class App {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
	
}
