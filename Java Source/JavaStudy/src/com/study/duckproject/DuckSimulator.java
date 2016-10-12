package com.study.duckproject;

public class DuckSimulator {

	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		ModelDuck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.performQuack();
	}

}
