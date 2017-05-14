package boot.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(AppArgsBean.HELLO_MSG_2)
public class AppArgsBean {
	
	public static final String HELLO_MSG_2 = "HELLO_MSG_2";

	private ApplicationArguments args;
	
	@Autowired
	public AppArgsBean(ApplicationArguments args) {
		this.args = args;
	}
	
	@Bean
	public String helloWorld() {
		List<String> optionValues = args.getOptionValues(HELLO_MSG_2);
		return optionValues.get(0);
	}
}
