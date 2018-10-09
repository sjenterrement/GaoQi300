package employee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Transform extends JFrame implements ActionListener {
	// ����2���̶��ı�
	JLabel j1 = new JLabel("Source");
	JLabel j2 = new JLabel("Trans");
	// ����2���ı���
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	// ����1����ť
	JButton b = new JButton("Transform");
	static JPanel p = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();

	public Transform() {
		// t2���ı��򲻿ɲ���
		t2.setEnabled(false);
		// b�������¼����ֱ�������actionPerformed��Copy�¼����Ӧ
		b.setActionCommand("Transform");
		b.addActionListener(this);

		// ʹ��GridLayout����
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
		frame.getContentPane().add(p); // ��ʼ��һ�����������������������
		frame.setTitle("Texbox");
		frame.setSize(200, 150);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand() == "Transform") {
			// ���������ʱ��ΪTransform��
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
