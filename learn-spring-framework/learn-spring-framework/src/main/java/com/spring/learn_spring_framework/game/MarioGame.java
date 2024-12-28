package com.spring.learn_spring_framework.game;

public class MarioGame implements GamingConsole {
	@Override
	public void down() {
		System.out.println("Go into a hole");
	}

	@Override
	public void left() {
		System.out.println("Go back");
	}

	@Override
	public void right() {
		System.out.println("Accelerate");
	}

	@Override
	public void up() {
		System.out.println("Jump");
	}
}
