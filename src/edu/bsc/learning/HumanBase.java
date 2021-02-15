package edu.bsc.learning;

public class HumanBase {

	int age;
	String name;
	int height;


	public HumanBase(int age,int height, String name) {

		this.age = age;
		this.height = height;
		this.name= name;

	}


	public void speak() {

		System.out.println("Hello My Name is : "+name);
		System.out.println("My Height is : "+height);
		System.out.println("My Age is : "+age);
	}






}
