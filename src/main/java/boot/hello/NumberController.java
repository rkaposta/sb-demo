package boot.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NumberController {

	@RequestMapping("/number")
    @ResponseBody
	public int number(@RequestParam int number) {
		return number;
	}
	
}
