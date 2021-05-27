package com.gongdsi.xiangmu.mokuai;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestMain {
	JFrame jFrame;

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new TestMain().initView();
	}

	public void initView() {
		jFrame = new JFrame("计算器");
		jFrame.setBounds(0, 0, 600, 600);
		// 注意这里
		jFrame.setLayout(null);

		JTextField jTextField1 = new JTextField("1");
		jTextField1.setBounds(100, 100, 80, 60);
		jFrame.add(jTextField1);

		JLabel jLabel = new JLabel("+");
		jLabel.setBounds(200, 100, 40, 60);
		jFrame.add(jLabel);

		JTextField jTextField2 = new JTextField("2");
		jTextField2.setBounds(230, 100, 80, 60);
		jFrame.add(jTextField2);

		JButton jbButton = new JButton("=");
		jbButton.setBounds(330, 100, 80, 60);
		jFrame.add(jbButton);

		JTextField jTextField3 = new JTextField("");
		jTextField3.setBounds(420, 100, 80, 60);
		jFrame.add(jTextField3);

		jFrame.setVisible(true);

		jbButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				int a = Integer.parseInt(jTextField1.getText());
				int b = Integer.parseInt(jTextField2.getText());
				int c = a + b;
				jTextField3.setText("" + c);

			}
		});
	}
}
