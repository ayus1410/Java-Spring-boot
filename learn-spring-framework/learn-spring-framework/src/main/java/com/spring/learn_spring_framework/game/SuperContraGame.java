package com.spring.learn_spring_framework.game;

public class SuperContraGame implements GamingConsole {

	@Override
	public void down() {
		System.out.println("Sit Down");
	}

	@Override
	public void left() {
		System.out.println("Go back");
	}

	@Override
	public void right() {
		System.out.println("Shoot a bullet");
	}

	@Override
	public void up() {
		System.out.println("Up");
	}

}