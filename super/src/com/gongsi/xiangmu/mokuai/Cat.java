package com.gongsi.xiangmu.mokuai;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}
	
	public void setName( String name) {
		super.setName(name);
	}
	public void eat() {
		super.eat();
		System.out.println("yu");
	}
}
