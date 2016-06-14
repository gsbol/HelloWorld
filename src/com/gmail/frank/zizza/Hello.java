package com.gmail.frank.zizza;

public class Hello {

	public String str = "Hello World!";

	public Hello() {

		runHello();

	}

	public void runHello() {

		System.out.println(str);

	}

	public static void main(String[] args) {

		new Hello();

	}

}
