package boot.beans;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultHelloConfig {
	
	@Bean
	@ConditionalOnMissingBean(name = "helloWorld")
	public String helloWorld() {
		return "Hello Default!";
	}

}
