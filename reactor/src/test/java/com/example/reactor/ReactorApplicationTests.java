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
	
	@Test
	public void fluxMorePlay() {
	 Flux<String> obj = Flux.just("abc", "def", "hlm")
			 				.log()
	                        .filter(n -> n.contains("hlm"))
	                        ;
	 
	 
	 StepVerifier.create(obj)
	             .expectNext("hlm")
	             .verifyComplete();
	 
	
	 Flux<Player> playerFlux = Flux.just("Michael Jordon", "Sachin Tendulkar")
			                 .map(n -> {
			                	 String[] split = n.split("\\s");
			                	 return new Player(split[0],split[1]);
			                 });
	 
	 StepVerifier.create(playerFlux)
	 .expectNext(new Player("Michael", "Jordon"))
	 .expectNext(new Player("Sachin", "Tendulkar"))
	 .verifyComplete();
		
	}

}
