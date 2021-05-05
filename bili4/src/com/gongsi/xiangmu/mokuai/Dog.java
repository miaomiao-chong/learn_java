package com.gongsi.xiangmu.mokuai;

public class Dog extends Animal{
	private String name;
	
	public void setName(String name){
		this.name=name;
		super.setName(name);
	}
	public void eat(){
		super.eat();
		System.out.println("ºÃ³ÔµÄ");
	}

}
