package com.gongsi.xiangmu.mokuai;

public class TestMain {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Animal animal=new Animal();
		animal.setCount(1111);
		Animal.addcount();
		Animal.addcount();
		animal.addcount();
		System.out.println(animal.getCount());
	}

}
