package com.study.duckproject;

public class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void display() {
		System.out.println("오리입니다.");
	}

	public void swim() {
		System.out.println("수영 할 수 있다.");
	}
	
	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void setFlybehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
