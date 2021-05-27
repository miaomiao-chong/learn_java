package com.gongsi.xiangmu.mokuai;

import java.util.ArrayList;
import java.util.HashMap;

public class TestMain {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Stu stu1 = new Stu("张三", 18);
		Stu stu2 = new Stu("李四", 18);
		Stu stu3 = new Stu("王五", 18);

		ArrayList<Stu> list = new ArrayList<>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());

		}

		HashMap<String, String> map = new HashMap<>();
		map.put("name", "zhangsan");
		System.out.println(map.get("name"));

	}

}
