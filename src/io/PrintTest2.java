package io;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * ��ӡ�� PrintStream
 * 
 * @author SJ
 *
 */
public class PrintTest2 {
	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream("print.txt")), true);
		pw.println("��ӡ��");
		pw.println(true);
		pw.close();
	}
}
