package com.emc.xcp.sample;

public class DecoratorTest {
	
	public static void main(String args[]){
		Icecream i = new HoneyDecorator( new NutDecorator(new PlainIcecream()));
		System.out.println(i.makeIcecream());
		
		Icecream icecream = new PlainIcecream();
		System.out.println(icecream.makeIcecream());
	}

}
