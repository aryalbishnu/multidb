package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.mysql.model.User;
import com.example.demo.mysql.repo.UserRepo;
import com.example.demo.postgres.model.Product;
import com.example.demo.postgres.repo.ProductRepo;

@SpringBootTest
class MultipleDatabaseApplicationTests {
  @Autowired
  ProductRepo productRepo;
  
  @Autowired
  UserRepo userRepo;
  
  Logger logger = LoggerFactory.getLogger(MultipleDatabaseApplicationTests.class);

	@Test
	void contextLoads() {
	}
	
	@Test
	void testofUser() {
	  User user = User.builder().age(25).name("aryal").email("aryal.com").build();
	  Product product = Product.builder().name("laptop").about("new model laptop of 2023").price(65000).build();
	  userRepo.save(user);
	  productRepo.save(product);
	  System.out.println("finally process is succesfull......");
	  logger.info("user: {}", user);
	  logger.info("product: {}", product);
	}

}
