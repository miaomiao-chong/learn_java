
package jisuanqi;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.LambdaConversionException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.xml.parsers.DocumentBuilder;

public class TestMain {
	JFrame jFrame;
	double x;
	String op = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestMain().show();
	}

	public void show() {
		//
		jFrame = new JFrame("计算器");
		jFrame.setBounds(1000, 250, 400, 420);
		jFrame.setLayout(null);

		// textField
		JTextField jTextField = new JTextField("0");
		jTextField.setBounds(20, 20, 330, 50);
		jTextField.setText("0");
		jFrame.add(jTextField);

		// 1
		JButton jButton1 = new JButton("1");
		jButton1.setBounds(20, 90, 50, 50);

		jButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String x = jTextField.getText();
				if (x.equals("0")) {
					jTextField.setText("1");
				} else {
					x = x + "1";
					jTextField.setText(x);
				}
			}
		});

		jFrame.add(jButton1);

		// 2
		JButton jButton2 = new JButton("2");
		jButton2.setBounds(90, 90, 50, 50);

		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String x = jTextField.getText();
				if (x.equals("0")) {
					jTextField.setText("2");
				} else {
					x = x + "2";
					jTextField.setText(x);
				}
			}
		});

		jFrame.add(jButton2);

		// 3
		JButton jButton3 = new JButton("3");
		jButton3.setBounds(160, 90, 50, 50);

		jButton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String x = jTextField.getText();
				if (x.equals("0")) {
					jTextField.setText("3");
				} else {
					x = x + "3";
					jTextField.setText(x);
				}
			}
		});

		jFrame.add(jButton3);

		// 4
		JButton jButton4 = new JButton("4");
		jButton4.setBounds(20, 160, 50, 50);

		jButton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String x = jTextField.getText();
				if (x.equals("0")) {
					jTextField.setText("4");
				} else {
					x = x + "4";
					jTextField.setText(x);
				}
			}
		});

		jFrame.add(jButton4);

		// 5
		JButton jButton5 = new JButton("5");
		jButton5.setBounds(90, 160, 50, 50);

		jButton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String x = jTextField.getText();
				if (x.equals("0")) {
					jTextField.setText("5");
				} else {
					x = x + "5";
					jTextField.setText(x);
				}
			}
		});

		jFrame.add(jButton5);

		// 6
		JButton jButton6 = new JButton("6");
		jButton6.setBounds(160, 160, 50, 50);

		jButton6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String x = jTextField.getText();
				if (x.equals("0")) {
					jTextField.setText("6");
				} else {
					x = x + "6";
					jTextField.setText(x);
				}
			}
		});

		jFrame.add(jButton6);

		// 7
		JButton jButton7 = new JButton("7");
		jButton7.setBounds(20, 230, 50, 50);

		jButton7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String x = jTextField.getText();
				if (x.equals("0")) {
					jTextField.setText("7");
				} else {
					x = x + "7";
					jTextField.setText(x);
				}
			}
		});

		jFrame.add(jButton7);

		// 8
		JButton jButton8 = new JButton("8");
		jButton8.setBounds(90, 230, 50, 50);

		jButton8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String x = jTextField.getText();
				if (x.equals("0")) {
					jTextField.setText("8");
				} else {
					x = x + "8";
					jTextField.setText(x);
				}
			}
		});

		jFrame.add(jButton8);

		// 9
		JButton jButton9 = new JButton("9");
		jButton9.setBounds(160, 230, 50, 50);

		jButton9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String x = jTextField.getText();
				if (x.equals("0")) {
					jTextField.setText("9");
				} else {
					x = x + "9";
					jTextField.setText(x);
				}
			}
		});

		jFrame.add(jButton9);

		// 0
		JButton jButton0 = new JButton("0");
		jButton0.setBounds(20, 300, 50, 50);

		jButton0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String x = jTextField.getText();
				if (x.equals("0")) {
					return;
				} else {
					x = x + "0";
					jTextField.setText(x);
				}
			}
		});

		jFrame.add(jButton0);

		// .
		JButton jButtondian = new JButton(".");
		jButtondian.setBounds(90, 300, 50, 50);

		jButtondian.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String x = jTextField.getText();
				if (x.contains(".")) {
					return;
				} else {
					x = x + ".";
					jTextField.setText(x);
				}
			}
		});
		jFrame.add(jButtondian);

		// C
		JButton jButtonc = new JButton("c");
		jButtonc.setBounds(160, 300, 50, 50);

		jButtonc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jTextField.setText("0");
			}
		});
		jFrame.add(jButtonc);

		// 符号+
		JButton jButtonjia = new JButton("+");
		jButtonjia.setBounds(230, 90, 50, 50);
		jButtonjia.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
<<<<<<< HEAD
				x = Double.parseDouble(jTextField.getText());
				op = "+";
=======
				op = "+";
				x = Double.parseDouble(jTextField.getText());
>>>>>>> 2693e96dc0ecb67b81b3ceadf03910aba66fb965
				jTextField.setText("0");
			}
		});
		jFrame.add(jButtonjia);

		// 符号-
		JButton jButtonjian = new JButton("-");
		jButtonjian.setBounds(230, 160, 50, 50);
		jButtonjian.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
<<<<<<< HEAD
				x = Double.parseDouble(jTextField.getText());
				op = "-";
=======
				op = "-";
				x = Double.parseDouble(jTextField.getText());
>>>>>>> 2693e96dc0ecb67b81b3ceadf03910aba66fb965
				jTextField.setText("0");
			}
		});
		jFrame.add(jButtonjian);

		// 符号*
		JButton jButtoncheng = new JButton("*");
		jButtoncheng.setBounds(230, 230, 50, 50);
		jButtoncheng.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
<<<<<<< HEAD
				x = Double.parseDouble(jTextField.getText());
				op = "*";
=======
				op = "*";
				x = Double.parseDouble(jTextField.getText());
>>>>>>> 2693e96dc0ecb67b81b3ceadf03910aba66fb965
				jTextField.setText("0");
			}
		});
		jFrame.add(jButtoncheng);

		// 符号/
		JButton jButtonchu = new JButton("/");
		jButtonchu.setBounds(230, 300, 50, 50);
		jButtonchu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
<<<<<<< HEAD
				x = Double.parseDouble(jTextField.getText());
				op = "/";
=======
				op = "/";
				x = Double.parseDouble(jTextField.getText());
>>>>>>> 2693e96dc0ecb67b81b3ceadf03910aba66fb965
				jTextField.setText("0");
			}
		});
		jFrame.add(jButtonchu);

		// 等于号=
		JButton jButtondengyu = new JButton("=");
		jButtondengyu.setBounds(300, 90, 50, 260);
		jButtondengyu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				double y=Double.parseDouble(jTextField.getText());
<<<<<<< HEAD
				if(op=="+") {
					jTextField.setText(""+(x+y));
				}
				if(op=="-") {
					jTextField.setText(""+(x-y));
				}
				if(op=="*") {
					jTextField.setText(""+(x*y));
				}
				if(op=="/") {
					jTextField.setText(""+(x/y));
				}
=======
				double sum=0;
				if(op=="+") {
					sum=x+y;
				}
				if(op=="-") {
					sum=x-y;
				}
				if(op=="*") {
					sum=x*y;
				}
				if(op=="/") {
					sum=x/y;
				}
				jTextField.setText(""+sum);
				
>>>>>>> 2693e96dc0ecb67b81b3ceadf03910aba66fb965
			}
		});
		jFrame.add(jButtondengyu);

		jFrame.setVisible(true);
	}

}
