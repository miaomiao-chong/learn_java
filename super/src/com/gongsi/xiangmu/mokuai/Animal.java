package com.gongsi.xiangmu.mokuai;


public class Animal {
	private String name;
	private static int count=0;
	
	public static void addcount() {
		Animal animal=new Animal();
		int a=animal.getCount();
		animal.setCount(++a);
	}
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
