package learn_java;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		Car car=new Car();
//		car.setD(1);
//		car.setT(4);
//		car.setE();
//		car.show();
		
//		���⼸�����浽������  ��Ϊ����10������������Ҫ�ܳ�ʱ�� �����Ȳ���3����
		Scanner scanner=new Scanner(System.in);
		Car []cars=new Car[3];
		for (int i = 0; i < cars.length; i++) {
			//ע�������ÿһ��Ԫ�س�ʼ��
			cars[i]=new Car();
			
			System.out.println("�����"+(i+1)+"���������d");
			double d=scanner.nextDouble();
			cars[i].setD(d);
			System.out.println("�����"+(i+1)+"��������ʱt");
			double t=scanner.nextDouble();
			cars[i].setT(t);
			
			cars[i].setE();
			
		}
		//ð��   ��С��������
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
