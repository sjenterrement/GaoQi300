package employee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Transform extends JFrame implements ActionListener {
	// 创建2个固定文本
	JLabel j1 = new JLabel("Source");
	JLabel j2 = new JLabel("Trans");
	// 创建2个文本框
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	// 创建1个按钮
	JButton b = new JButton("Transform");
	static JPanel p = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();

	public Transform() {
		// t2个文本框不可操作
		t2.setEnabled(false);
		// b触发的事件，分别与下面actionPerformed的Copy事件相对应
		b.setActionCommand("Transform");
		b.addActionListener(this);

		// 使用GridLayout布局
		p.setLayout(new BorderLayout());

		p1.add(j1);
		p1.add(t1);
		p1.add(j2);
		p1.add(t2);
		p2.add(b);
		p.add(p1, BorderLayout.CENTER);
		p.add(p2, BorderLayout.SOUTH);

		p1.setLayout(new GridLayout(2, 2));
		p2.setLayout(new GridLayout(1, 1));

	}

	public static void main(String[] args) {
		JFrame frame = new Transform();
		frame.getContentPane().add(p); // 初始化一个容器，在上面添加子容器
		frame.setTitle("Texbox");
		frame.setSize(200, 150);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand() == "Transform") {
			// 如果触发的时间为Transform，
			/*
			 * String b = t1.getText().toUpperCase(); t2.setText(b);
			 */
			// String b = t1.getText().toLowerCase();
			// t2.setText(b);
			String str = t1.getText();
			double c = Double.parseDouble(str);
			double f=(9/5)*c+32;
			String str2=f+"";
			t2.setText(str2);
		}

	}

}
