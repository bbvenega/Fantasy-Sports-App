package com.brianvenegas.fantasysports.fantasy_sports_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
import com.brianvenegas.League;



@SpringBootApplication
public class FantasySportsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FantasySportsAppApplication.class, args);
		System.out.println("Hello World!");
		Scanner scanner = new Scanner(System.in);
		
		String word =  scanner.nextLine();
		System.out.println(word);




		
	}

}
