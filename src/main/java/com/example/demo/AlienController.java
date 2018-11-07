package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Alien;
import com.example.demo.repo.AlienRepo;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;

	@RequestMapping("home")
	public String homeDisplay() {
		
		return "home.jsp";
	}
	
	@RequestMapping("add")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("get")
	public ModelAndView getAlien(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("display.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien());
		System.out.println(repo.findByAname("Pooja"));
		System.out.println(repo.findByAidGreaterThan(102));
		mv.addObject("alien", alien);
		return mv;
	}
}
