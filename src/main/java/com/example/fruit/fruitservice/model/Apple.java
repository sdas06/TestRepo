package com.example.fruit.fruitservice.model;

import org.springframework.stereotype.Component;

@Component
public class Apple {
	public Apple() {
		// TODO Auto-generated constructor stub
		System.out.println("-----------INSIDE Apple constructor--------");
	}
	
	public void printApple() {
		
		System.out.println("------------PRINTING Apple---------");
		
	}

}
