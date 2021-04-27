package learn_java;

public class Car {
	private double d,t,e;
	private String id;
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	public double getT() {
		return t;
	}
	public void setT(double t) {
		this.t = t;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//·½·¨ÖØÔØ
	public void setE() {
		e=d/t;
	}
	public void show() {
		System.out.println(e);
	}
}
