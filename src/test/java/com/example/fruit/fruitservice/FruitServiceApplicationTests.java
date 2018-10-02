package com.example.fruit.fruitservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.fruit.fruitservice.model.Apple;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FruitServiceApplicationTests {

	@Autowired
	Apple apple;
	@Test
	public void contextLoads() {
		System.out.println("-------------Insiding testing Apple------");
		apple.printApple();
	}

}
