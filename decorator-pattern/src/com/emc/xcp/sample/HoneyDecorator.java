package com.emc.xcp.sample;

public class HoneyDecorator extends IcecreamDecorator {

	public HoneyDecorator(Icecream specialIcecream) {
		super(specialIcecream);
	}
	
	public String makeIcecream(){
		return specialIcecream.makeIcecream() + getHoney();
	}

	private String getHoney() {
		return "+ adding Honey";
	}

}
