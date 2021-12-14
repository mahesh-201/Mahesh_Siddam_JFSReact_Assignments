package com.mahesh;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {
	
	@RequestMapping("/enter")
	public String landingPage() {
	
		return "SIcalculation.jsp";
	
	}
	
	@RequestMapping("/calculate")
	public ModelAndView calculateIntrest(HttpServletRequest request, HttpServletResponse response) {
		
		double principal = Double.parseDouble(request.getParameter("pamount"));
		double noYear = Double.parseDouble(request.getParameter("noyear"));
		double rateOfInterest = Double.parseDouble(request.getParameter("intrest"));
		double simpleInterest = ((principal*noYear*rateOfInterest)/100);
		
		ModelAndView mv = new ModelAndView("SIresult.jsp");
		mv.addObject("result", simpleInterest);
		return mv;
		
	}
}