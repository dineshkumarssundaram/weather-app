package com.dinesh.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WeatherAppApplication {

	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome to Weather application...";
	}

//	echo "# weather-app" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin git@github.com:dineshkumarssundaram/weather-app.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(WeatherAppApplication.class, args);
	}

}
