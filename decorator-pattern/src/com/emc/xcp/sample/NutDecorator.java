package com.emc.xcp.sample;

public class NutDecorator extends IcecreamDecorator {

	public NutDecorator(Icecream specialIcecream) {
		super(specialIcecream);
	}
	
	public String makeIcecream(){
		return specialIcecream.makeIcecream() + addNuts();
	}

	private String addNuts() {
		return "+ adding nuts";
	}

}
