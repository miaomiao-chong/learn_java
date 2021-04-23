package com.gongsi.xiangmu.mokuai;

public class Student {
	private double math,english,sum;
	private String id;
	
	public void show() {
		sum=math+english;
		System.out.println("id="+id+"   "+"×Ü·Ö£º"+sum);
	}
	
	
 	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
