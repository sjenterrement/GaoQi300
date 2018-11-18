package io.decorate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/**
 * 文件字节输出流
 * 1.创建流
 * 2.选择流
 * 3.操作
 * 3。关闭
 * @author SJ
 *
 */
public class BufferedTest04 {
	public static void main(String[] args) {
		//1.创建流
		File dest = new File("dest.txt");
		
		//2.选择流
		Writer wt=null;
		try {
			wt=new FileWriter(dest);
			//3.操作
			
			//写法1
//			String msg="BTS 金南俊 金硕珍 闵玧其 郑号锡 朴智旻 金泰亨 田柾国";
//			char[] datas = msg.toCharArray();//字符串--》字符数组
//			wt.write(datas, 0, datas.length);
			
			//写法2
//			String msg="BTS 金南俊 金硕珍 闵玧其 郑号锡 朴智旻 金泰亨 田柾国";
//			wt.write(msg);
			
			//写法3
			String msg="BTS 金南俊 金硕珍 闵玧其 郑号锡 朴智旻 金泰亨 田柾国\n";
			wt.append(msg).append(msg);
			
			wt.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null!=wt) {
				try {
					wt.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
