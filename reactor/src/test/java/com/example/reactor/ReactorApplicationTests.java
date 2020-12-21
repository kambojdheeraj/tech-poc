package com.example.reactor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@SpringBootTest
class ReactorApplicationTests {

	
	
	@Test
	public void createAFlux_fromArray() {
		String[] fruits = new String[] {"Apple", "Orange", "Grape"};
		Flux<String> fruitFlux = Flux.fromArray(fruits);
		
		StepVerifier.create(fruitFlux)
		.expectNext("Apple")
		.expectNext("Orange")
		.expectNext("Grape")
		.verifyComplete();
		
	}

}
