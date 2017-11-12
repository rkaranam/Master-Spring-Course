package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	// What are the beans?
	// Ans: BinarySearchImpl and BubbleSortAlgorithm.. @Component

	// What are the dependencies of a bean?
	// Ans: BubbleSortAlgorithm is a dependency of BinarySearchImpl.. @Autowired

	// Where to search for beans?
	// Ans: ApplicationContext, here NO need as it searches
	// package where this @SpringBootApplication is present
	// and its sub-packages

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl bs = applicationContext.getBean(BinarySearchImpl.class);
		int result = bs.binarySearch(new int[] { 12, 4, 76 }, 3);
		System.out.println("Result by Spring after configuring: " +result);
	}
}
