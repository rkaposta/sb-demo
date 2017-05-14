package boot.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanDataController {
	
	@Autowired
	private String helloWorld;
	
    @RequestMapping("/bean")
    @ResponseBody
    String home() {
        return helloWorld;
    }

}
