package boot.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import boot.beans.RelaxedBinding;

@Controller
public class RelaxedBindingController {

	@Autowired
	private RelaxedBinding rb;
    
    @RequestMapping("/binding")
    @ResponseBody
    String binding() {
        return rb.getTextSample();
    }


}