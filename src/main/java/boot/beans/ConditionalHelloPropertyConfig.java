package boot.beans;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@ConditionalOnProperty(ConditionalHelloPropertyConfig.HELLO_MSG)
@ConditionalOnMissingBean(name = "helloWorld")
public class ConditionalHelloPropertyConfig {
	
	public static final String HELLO_MSG = "HELLO_MSG";
	
	private final Environment environment;
	
	public ConditionalHelloPropertyConfig(Environment env) {
		this.environment = env;
	}
	
	@Bean
	public String helloWorld() {
		return environment.getProperty(HELLO_MSG);
	}
	
}
