package com.practice.som.SpringFramework.gameSpringBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.som.SpringFramework.game.GameRunner;
import com.practice.som.SpringFramework.game.GamingConsole;
import com.practice.som.SpringFramework.game.PacManGame;

@Configuration
public class AppGamingConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner() {
		var gameRunner = new GameRunner(game());
		return gameRunner;
	}

	
}
