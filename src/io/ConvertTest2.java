package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

/**
 * 1.���ַ�������ʽ��ʽ�ֽ��������ı��ģ� 2.ָ���ַ���
 * 
 * @author SJ
 *
 */

public class ConvertTest2 {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(new URL("http://www.baidu.com").openStream(), "UTF-8"));) {
			// 3.��������ȡ��
			String msg;
			while ((msg = reader.readLine()) != null) {
				System.out.println(msg);
			}
		} catch (IOException e) {
			System.out.println("ERROR");
		}
	}

	public static void test2() {
		// ���������������ذٶ�Դ����
		try (InputStreamReader is = new InputStreamReader(new URL("http://www.baidu.com").openStream(), "UTF-8");) {
			// 3.��������ȡ��
			int temp;
			while ((temp = is.read()) != -1) {
				System.out.print((char) temp);
			}
		} catch (IOException e) {
			System.out.println("ERROR");
		}
	}

	public static void test1() {
		// ���������������ذٶ�Դ����
		try (InputStream is = new URL("http://www.baidu.com").openStream();) {
			// 3.��������ȡ��
			int temp;
			while ((temp = is.read()) != -1) {
				System.out.println((char) temp);
			}
		} catch (IOException e) {
			System.out.println("ERROR");
		}

	}
}