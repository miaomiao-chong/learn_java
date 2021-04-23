package com.gongsi.xiangmu.mokuai;

public class Triangle {
	private double width,height;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public  double show() {
		return 2*(width+height);
	}
}
