package com.study.duckproject;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		setFlybehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
}
