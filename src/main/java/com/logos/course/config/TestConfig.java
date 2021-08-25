package com.logos.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.logos.course.entities.Category;
import com.logos.course.entities.Order;
import com.logos.course.entities.User;
import com.logos.course.entities.enums.OrderStatus;
import com.logos.course.repositories.CategoryRepository;
import com.logos.course.repositories.OrderRepository;
import com.logos.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");

		User u = new User(null, "Bene", "bene@gmail.com", "333333", "4545454");
		User u2 = new User(null, "Jão", "jao@gmail.com", "555555", "23232323");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT,u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT,u);
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2, cat3));

		userRepository.saveAll(Arrays.asList(u, u2));
		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));

	}

}
