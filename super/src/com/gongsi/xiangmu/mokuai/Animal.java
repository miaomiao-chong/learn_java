//Animal.java
package com.gongsi.xiangmu.mokuai;


public class Animal {
	private String name;
	public Animal(String name) {
		this.name=name;
	}
	public Animal() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.print(name+"³Ô");
	
	}

}
