package com.gongsi.xiangmu.mokuai;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		Student[] s = new Student[3];
		Teather[] t = new Teather[2];

		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
			System.out.println("�����" + (i + 1) + "ѧ����id��name���ο���ʦ");
			s[i].setId(scanner.next());
			s[i].setName(scanner.next());
			s[i].settName(scanner.next());
		}

		for (int i = 0; i < t.length; i++) {
			t[i] = new Teather();
			System.out.println("�����" + (i + 1) + "��ʦ��name");
			t[i].setName(scanner.next());
		}

		String teather;
		System.out.println("����������һλ��ʦ");
		teather = scanner.next();

		for (int i = 0; i < s.length; i++) {
			if (s[i].gettName().equals(teather)) {
				System.out.println("����ѧ����" + s[i].getName());
			}
		}

		for (int i = 0; i < s.length; i++) {
			if (s[i].gettName().equals(teather)) {
				System.out.println("Ϊ" + s[i].getName() + "����ɼ���");
				s[i].setScore(scanner.nextInt());
			}
		}
		// ð������

		for (int i = 0; i < s.length - 1; i++) {
			for (int j = 0; j < s.length - 1 - i; j++) {
				if (s[j].getScore() > s[j + 1].getScore()) {
					Student temp = new Student();
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].getId() + "  " + s[i].getName() + "  " + s[i].gettName() + "  " + s[i].getScore());
		}

	}

}
