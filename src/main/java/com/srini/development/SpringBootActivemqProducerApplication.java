package com.srini.development;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootActivemqProducerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActivemqProducerApplication.class, args);
	}
	
	@Bean
	public Queue QueueFoo() {
		return new Queue("Queue.Foo", false);
	} 
	@Bean
	public TopicExchange exchange() {
		return new TopicExchange("Queue.Foo");
	}
	
	@Bean
	Jackson2JsonMessageConverter jhackson2MessageConverter() {
		Jackson2JsonMessageConverter jackson2JsonMessageConverter = new Jackson2JsonMessageConverter();
		return jackson2JsonMessageConverter;
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
