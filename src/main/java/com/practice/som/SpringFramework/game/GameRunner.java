package com.practice.som.SpringFramework.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	GamingConsole gc;
	
	public GameRunner(GamingConsole gc) {

		this.gc = gc;
	}

	public void run() {
		
		System.out.println("Running game: " + gc);
		gc.up();
		gc.down();
		gc.left();
		gc.right();
	}

}
