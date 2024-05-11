package com.example.orderservice.services;

import com.example.orderservice.models.Order;
import com.example.orderservice.models.User;
import com.example.orderservice.repositories.OrderRepository;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final RestTemplate restTemplate;
    private static final String BASEURL = "http://localhost:8081/users";
    private int attempt=1;

    public OrderService(OrderRepository orderRepository, RestTemplate restTemplate){
        this.orderRepository = orderRepository;
        this.restTemplate = restTemplate;
    }

    @Retry(name = "orderService")
    public List<Order> getAllOrder() {
//        List<Order> orderList = orderRepository.findAll();
//        for(Order o : orderList){
//            User user = restTemplate.getForObject(BASEURL+"/get-all/"+o.getId(), User.class);
//            o.setUser(user);
//        }
        System.out.println("retry method called "+attempt++ +" times"+" at "+new Date());
//        return orderList;
        return restTemplate.getForObject(BASEURL+"/get-all", ArrayList.class);
    }

}
