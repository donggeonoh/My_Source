package com.dku.dmap.study;

public class Car {
	   private String modelName;
	   private int producedYear;
	   private int price_won;
	   
	   public Car(String _ModelName, int _producedYear, int _price_won) {
	      modelName = _ModelName;
	      producedYear = _producedYear;
	      price_won = _price_won;
	   }
	   
	   public void showModelName() {
	      System.out.println("Model Name : " + modelName);
	   }
	   
	   public void showProducedYear() {
	      System.out.println("Produced Year : " + producedYear);
	   }
	   
	   public void showPrice() {
	      System.out.println("Price(won) : " + price_won);
	   }
	   
	   public static void main(String[] args) {
	      Car kimsCar = new Car("Bentley Continental GT", 2016, 200000000);
	      
	      kimsCar.showModelName();
	      kimsCar.showProducedYear();
	      kimsCar.showPrice();
	   }
	}