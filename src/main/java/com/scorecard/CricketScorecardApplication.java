package com.scorecard;

import com.scorecard.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CricketScorecardApplication {

	@Autowired
	TeamService teamService;

	@Autowired
	PlayerService playerService;

	@Autowired
	PlayerService inningService;

	@Autowired
	MatchService matchService;

	@Autowired
	OverService overService;

	@Autowired
	ScoreService scoreService;

	@Autowired
	WicketService wicketService;



	public static void main(String[] args) {
		SpringApplication.run(CricketScorecardApplication.class, args);
	}

	@RequestMapping("/hello")
	public String sayHello(){
		return "say ";
	}

	@RequestMapping("/")
	public String sayWelcome(){
		return "Welcome to cricscorer";
	}

	@RequestMapping("/clear")
	public void clear(){

		teamService.deleteAll();
		playerService.deleteAll();
		inningService.deleteAll();
		overService.deleteAll();
		scoreService.deleteAll();
		wicketService.deleteAll();
		matchService.deleteAll();


	}
}
