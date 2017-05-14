package boot.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class JsonController {
	
	@Autowired
	private ObjectMapper objectMapper;
	
	private static class MyData {
		public String message;
		public int val;
		
		public MyData(String message, int val) {
			this.message = message;
			this.val = val;
		}
	}

    @RequestMapping("/json")
    @ResponseBody
    String get() throws JsonProcessingException {
    	return objectMapper.writeValueAsString(new MyData("A válasz az életre, a világmindenségre, meg mindenre", 42));
    }
}
