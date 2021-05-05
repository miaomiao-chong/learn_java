package com.gongsi.xiangmu.mokuai;

public class Cat extends Animal{
	public Cat(String name) {
		super.setName(name);
	}
	
	public void eat(){
		super.eat();
		System.out.println("²»ºÃ³ÔµÄ");
	}
}
