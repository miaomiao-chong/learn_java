package com.gongsi.xiangmu.mokuai;

import org.omg.CORBA.TRANSACTION_MODE;

public class TestMain {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Triangle triangle=new Triangle();
		triangle.setHeight(20);
		triangle.setWidth(80);
		System.out.println(triangle.showZhouchang());
	}

}
