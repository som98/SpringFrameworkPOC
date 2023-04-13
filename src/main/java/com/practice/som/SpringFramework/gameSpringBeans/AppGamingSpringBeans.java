package com.practice.som.SpringFramework.gameSpringBeans;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.som.SpringFramework.game.GameRunner;
import com.practice.som.SpringFramework.game.GamingConsole;

public class AppGamingSpringBeans {
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext
				(AppGamingConfiguration.class)) {
			
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		} 
		catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
