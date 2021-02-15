package com.bsc.collection;

import java.util.*;


public class ArraylistCollection {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("C");
		al.add("C++");
		al.add("Python");
		al.add("Cobol");
		al.add("Database");

		//Size() of Array list
		System.out.println("Size of ArrayList is : " + al.size());

		// check if Array list is empty
		if(al.isEmpty() ) {

			System.out.println("ArrayList is Empty");
		} else {

			System.out.println("ArrayList is not Empty");
		}

		// Get ArrayList element
		//System.out.println("Second element of Array is : " + al.get(1));

		//Set ArrayList element
		//System.out.println("Set 5 th element in ArrayList is : " + al.set(4, "Fobol"));

		//System.out.println("Fifth element of Array is : " + al.get(4));
		
		//Remove ArrayList Element
		al.remove(al);
		
		//print All elements from ArrayList
		//System.out.println(al);
		
		//al.sort(null);
		
		//print All elements from ArrayList after sorting
		System.out.println(al);
		
		//Retrieves all elements from Array list
		
		//For loop
		
		/*
		 * for(int i=0;i<al.size();i++ ) {
		 * 
		 * System.out.println(al.get(i)); }
		 */
		
		// For each loop
		
		/*
		 * for(String s:al) {
		 * 
		 * System.out.println(s); }
		 */
		

		//Iterator
		
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
	
		//Sorting of elements
		
		Collections.sort(al);
		System.out.println(" Elements after Sorting : "+ al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(" Elements in reverse order : "+ al);
		
	}

}
