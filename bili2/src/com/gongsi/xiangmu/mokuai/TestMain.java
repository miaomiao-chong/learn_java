package com.gongsi.xiangmu.mokuai;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		Student student=new Student();
//		student.setEnglish(11);
//		student.setId("123456");
//		student.setMath(45);
//		student.show();
		Scanner scanner=new Scanner(System.in);
		Student []student=new Student[2];
		for (int i = 0; i < student.length; i++) {
			student[i]=new Student();   //注意这里要初始化
			System.out.println("分别输入id math english");
			String id=scanner.next();
			double m=scanner.nextDouble();
			double e=scanner.nextDouble();
			student[i].setId(id);
			student[i].setEnglish(e);
			student[i].setMath(m);
		
			
		}
		for (int i = 0; i < student.length; i++) {
			student[i].show();
			
		}
	}

}
