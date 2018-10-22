package org.controler;


import org.model.AnswerSuccess;
import org.model.AxaTopUps;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

@RequestMapping(value="/test")

public class AxaTopupWs {

	@RequestMapping(value="/changingQt",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	@ResponseBody
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public Object myService(@RequestBody AxaTopUps req){
		System.out.println("getting request "+req.getAttributes().getSlave_msisdn());
		
	
	
	return new AnswerSuccess("OK","200", "Request in processing");
	
	
	
	}
	
	
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
