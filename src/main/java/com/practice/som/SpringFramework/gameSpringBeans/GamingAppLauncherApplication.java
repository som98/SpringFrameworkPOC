package com.practice.som.SpringFramework.gameSpringBeans;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.som.SpringFramework.game.GameRunner;
import com.practice.som.SpringFramework.game.GamingConsole;

@Configuration
@ComponentScan("com.practice.som.SpringFramework.game")
public class GamingAppLauncherApplication {
	
	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
				(GamingAppLauncherApplication.class)) {
			
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		} 
		catch (BeansException e) {
			e.printStackTrace();
		}

	}

}

