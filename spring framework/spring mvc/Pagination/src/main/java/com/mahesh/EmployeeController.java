package com.mahesh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao dao;

	@RequestMapping("/{pageid}")
	public ModelAndView getEmployeeView(@PathVariable("pageid") int pageid) {
		int total = 5;
		int startRecord;
		if (pageid == 1) {
			startRecord = 1;
		} else {
			startRecord = (pageid - 1) * total + 1;
		}
		
		List<Employee> emplist = dao.getEmployeesByPage(startRecord, total);
		
		ModelAndView mv = new ModelAndView("ShowEmployees.jsp");
		mv.addObject("emplist", emplist);
		return mv;
	}
}