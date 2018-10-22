package org.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/testView")
public class TestController {

	
	
	@RequestMapping(value="/checkView",method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView getEmail(){
		
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("name", "lyes.bensaada");
		modelView.addObject("email", "lyes.bensaada@djezzy.dz");
		modelView.setViewName("one");
		return modelView;
	}
}
