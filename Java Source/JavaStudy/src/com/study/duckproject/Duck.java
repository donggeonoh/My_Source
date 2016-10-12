package com.study.duckproject;

public class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void display() {
		System.out.println("�����Դϴ�.");
	}

	public void swim() {
		System.out.println("���� �� �� �ִ�.");
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
