package com.gongsi.xiangmu.mokuai;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public void setName( String name) {
		super.setName(name);
	}
	public void eat() {
		super.eat();
		System.out.println("yu");
	}
}
