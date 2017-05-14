package boot.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="rb")
public class RelaxedBinding {
	private String textSample;

	public String getTextSample() {
		return textSample;
	}

	public void setTextSample(String textSample) {
		this.textSample = textSample;
	}
	
}
