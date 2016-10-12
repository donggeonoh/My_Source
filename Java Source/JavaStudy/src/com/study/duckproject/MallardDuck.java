package com.study.duckproject;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		setFlybehavior(new FlyWithWings());
		setQuackBehavior(new QuackQuack());
	}

}
