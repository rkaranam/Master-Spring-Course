package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired // Does adding @Autowired means we are using setter injection
	private SortAlgorithm sortAlgorithm;
	
	
	// Does using a constructor means we are using constructor injection
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int[] numbers, int numberToSearch) {
		
		// Implement Sorting Logic
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		// Implement Search Logic
		
		// Return the result
		return 3;
	}

}
