package com.gongsi.xiangmu.mokuai;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		Student student=new Student();
//		student.setEnglish(11);
//		student.setId("123456");
//		student.setMath(45);
//		student.show();
		Scanner scanner=new Scanner(System.in);
		Student []student=new Student[2];
		for (int i = 0; i < student.length; i++) {
			student[i]=new Student();   //ע������Ҫ��ʼ��
			System.out.println("�ֱ�����id math english");
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
