package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

/**
 * 1.以字符流的形式形式字节流（纯文本的） 2.指定字符集
 * 
 * @author SJ
 *
 */

public class ConvertTest2 {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(new URL("http://www.baidu.com").openStream(), "UTF-8"));) {
			// 3.操作（读取）
			String msg;
			while ((msg = reader.readLine()) != null) {
				System.out.println(msg);
			}
		} catch (IOException e) {
			System.out.println("ERROR");
		}
	}

	public static void test2() {
		// 操作网络流，下载百度源代码
		try (InputStreamReader is = new InputStreamReader(new URL("http://www.baidu.com").openStream(), "UTF-8");) {
			// 3.操作（读取）
			int temp;
			while ((temp = is.read()) != -1) {
				System.out.print((char) temp);
			}
		} catch (IOException e) {
			System.out.println("ERROR");
		}
	}

	public static void test1() {
		// 操作网络流，下载百度源代码
		try (InputStream is = new URL("http://www.baidu.com").openStream();) {
			// 3.操作（读取）
			int temp;
			while ((temp = is.read()) != -1) {
				System.out.println((char) temp);
			}
		} catch (IOException e) {
			System.out.println("ERROR");
		}

	}
}