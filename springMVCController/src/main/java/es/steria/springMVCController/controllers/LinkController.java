package es.steria.springMVCController.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LinkController {

	@RequestMapping(value="/welcome-page")
	public ModelAndView goToWelcomePage(){
		final ModelAndView resView = new ModelAndView();
		resView.setViewName("welcome");
		final String msg = "MVC Spring here!!";
		resView.addObject("message", msg);
		return resView;
	}
}
