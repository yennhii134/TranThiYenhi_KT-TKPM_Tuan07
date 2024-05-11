package com.example.orderservice;

import com.example.orderservice.models.Order;
import com.example.orderservice.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderServiceApplication {
	private final OrderRepository orderRepository;

	public OrderServiceApplication(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			for (int i=1; i<=10; i++){
				orderRepository.save(new Order("Order" + i));
			}
		};
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
