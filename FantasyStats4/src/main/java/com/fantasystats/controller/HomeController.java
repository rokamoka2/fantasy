package com.fantasystats.controller;
import org.springframework.ui.Model;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fantasystats.service.PlayerService;

@Controller
public class HomeController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	
	@Autowired
	PlayerService ps;
	
	@RequestMapping(path = "/")
	public String index(Model model) throws IOException {
		log.debug("Főoldal megnyitása");
		model.addAttribute("players", ps.getAllPlayersByWeek(2019, 1));
		return "index";
	}
	
	@RequestMapping(path = "/{SEASON}")
	public String index(@PathVariable(value="SEASON") int season ,Model model) throws IOException {
		log.debug("Főoldal megnyitása");
		model.addAttribute("players", ps.getAllPlayersBySeason(season));
		return "index";
	}

}
