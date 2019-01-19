package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 * 1.以字符流的形式形式字节流（纯文本的）
 * 2.指定字符集
 * @author SJ
 *
 */

public class ConvertTest {
	public static void main(String[] args) {
		//操作system.in和system.out
		try(BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));){
			//循环获取键盘的输入（exit推出），输出此内容
			String msg="";
			while (!msg.equals("exit")) {
				msg=reader.readLine();//循环读取
				writer.write(msg);
				writer.newLine();
				writer.flush();
			}
		}catch(IOException e) {
			System.out.println("ERROR");
		}
	}
}
