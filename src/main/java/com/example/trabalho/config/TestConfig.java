package com.example.trabalho.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.trabalho.entities.Order;
import com.example.trabalho.entities.User;
import com.example.trabalho.entities.enums.OrderStatus;
import com.example.trabalho.repositories.OrderRepository;
import com.example.trabalho.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		//id gerado no BDo
		User u1 = new User(0, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(0, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		//Instanciando os pedidos e fazendo associação com o User
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}

}