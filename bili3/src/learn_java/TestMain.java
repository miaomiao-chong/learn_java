package learn_java;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		Car car=new Car();
//		car.setD(1);
//		car.setT(4);
//		car.setE();
//		car.show();
		
//		把这几辆车存到数组里  因为输入10辆车的数据需要很长时间 所以先测试3辆车
		Scanner scanner=new Scanner(System.in);
		Car []cars=new Car[3];
		for (int i = 0; i < cars.length; i++) {
			//注意对数组每一个元素初始化
			cars[i]=new Car();
			
			System.out.println("输入第"+(i+1)+"辆车的里程d");
			double d=scanner.nextDouble();
			cars[i].setD(d);
			System.out.println("输入第"+(i+1)+"辆车的用时t");
			double t=scanner.nextDouble();
			cars[i].setT(t);
			
			cars[i].setE();
			
		}
		//冒泡   从小到大排序
		for(int i=0;i<cars.length-1;i++) {
			for(int j=0;j<cars.length-1-i;j++) {
				if(cars[j].getE()>cars[j+1].getE()) {
					Car temp=new Car();
					temp=cars[j];
					cars[j]=cars[j+1];
					cars[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i].getE());
			
		}
	}

}
