package jisuanqi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestMain {
	JFrame jFrame;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestMain().show();
	}
	public void show() {
		//创建图形界面
		jFrame  =new JFrame("计算器");
		jFrame.setBounds(1000, 250,400, 420);
		jFrame.setLayout(null);
		
		//顶部长条文本框
		JTextField jTextField = new JTextField();
		jTextField.setBounds(20, 20, 330, 50);
		jTextField.setText("");
		jFrame.add(jTextField);
		
		//数字1
		JButton jButton1 =new JButton("1");
		jButton1.setBounds(20, 90, 50, 50);
		jFrame.add(jButton1);
		
		//数字2
		JButton jButton2 =new JButton("2");
		jButton2.setBounds(90, 90, 50, 50);
		jFrame.add(jButton2);
		
		//数字3
		JButton jButton3 =new JButton("3");
		jButton3.setBounds(160, 90, 50, 50);
		jFrame.add(jButton3);
		
		//数字4
		JButton jButton4 =new JButton("4");
		jButton4.setBounds(20, 160, 50, 50);
		jFrame.add(jButton4);
		
		//数字5
		JButton jButton5 =new JButton("5");
		jButton5.setBounds(90, 160, 50, 50);
		jFrame.add(jButton5);
		
		//数字6
		JButton jButton6 =new JButton("6");
		jButton6.setBounds(160, 160, 50, 50);
		jFrame.add(jButton6);
		
		//数字7
		JButton jButton7 =new JButton("7");
		jButton7.setBounds(20, 230, 50, 50);
		jFrame.add(jButton7);
		
		//数字8
		JButton jButton8 =new JButton("8");
		jButton8.setBounds(90, 230, 50, 50);
		jFrame.add(jButton8);
		
		//数字9
		JButton jButton9 =new JButton("9");
		jButton9.setBounds(160, 230, 50, 50);
		jFrame.add(jButton9);
		
		//数字0
		JButton jButton0 =new JButton("0");
		jButton0.setBounds(20, 300, 50, 50);
		jFrame.add(jButton0);
		
		//小数点.
		JButton jButtondian =new JButton(".");
		jButtondian.setBounds(90, 300, 50, 50);
		jFrame.add(jButtondian);
		
		//归零符号C
		JButton jButtonc =new JButton("c");
		jButtonc.setBounds(160, 300, 50, 50);
		jFrame.add(jButtonc);
		
		//符号+
		JButton jButtonjia =new JButton("+");
		jButtonjia.setBounds(230, 90, 50, 50);
		jFrame.add(jButtonjia);
		
		//符号-
		JButton jButtonjian =new JButton("-");
		jButtonjian.setBounds(230, 160, 50, 50);
		jFrame.add(jButtonjian);
		
		//符号*
		JButton jButtoncheng =new JButton("*");
		jButtoncheng.setBounds(230, 230, 50, 50);
		jFrame.add(jButtoncheng);
		
		//符号/
		JButton jButtonchu =new JButton("/");
		jButtonchu.setBounds(230, 300, 50, 50);
		jFrame.add(jButtonchu);
		
		//等于号=
		JButton jButtondengyu =new JButton("=");
		jButtondengyu.setBounds(300, 90, 50, 260);
		jFrame.add(jButtondengyu);
				
		
		/*
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int x = Integer.parseInt(jTextField.getText());
				int y = Integer.parseInt(jTextField1.getText());
				int z =x+y;
				jTextField2.setText(""+z);	
			}
		});*/
		jFrame.setVisible(true);
	}

}
