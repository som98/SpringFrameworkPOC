package com.practice.som.SpringFramework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Up");
		
	}

	@Override
	public void down() {
		System.out.println("Sit down");
		
	}

	@Override
	public void right() {
		System.out.println("Shoot a Bullet");
		
	}

	@Override
	public void left() {
		System.out.println("Go Back");
		
	}
	

}
