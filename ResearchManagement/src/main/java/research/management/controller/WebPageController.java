package main.java.research.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import main.java.research.management.dao.IResearchManagementDao;
import main.java.research.management.model.Papers;

@Controller
@RequestMapping("Web/V1")
public class WebPageController {
	@Autowired
	IResearchManagementDao dao;
	
	@GetMapping(value="HelloWorld")
	public String HelloWorld(){
		return "HelloWorld";
	}
	
	@GetMapping(value="Index")
	public String index(ModelMap map) {
		List<Papers> papers =  dao.ListPapers();
		map.addAttribute("Papers", papers);
		return "Index";
	}
	
	@GetMapping(value="ShowAbstract/{id}")
	public String showAbstract(@PathVariable Integer id, ModelMap map) {
		Papers papers=dao.getPaper(id);
		map.addAttribute("Papers", papers);
		return "ShowAbstract";
		
	}
	
	

}
