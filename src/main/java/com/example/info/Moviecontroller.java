package com.example.info;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class Moviecontroller {
	@RequestMapping("/{movieId}")
	public Movieinfo getMovie(@PathVariable("movieId") String movieid) {
		return new Movieinfo(movieid,"GOT");
	}
	
}
