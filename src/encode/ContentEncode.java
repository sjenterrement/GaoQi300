package encode;

import java.io.UnsupportedEncodingException;

/**"
 * @author SJ
 * 字符集
 *
 */
public class ContentEncode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String BTS="金南俊金硕珍闵玧其郑号锡朴智旻金泰亨田柾国bts";//使用工程字符集
		//编码：字节数组
		byte[] datas =BTS.getBytes();
		System.out.println(datas.length);
		
		//其他字符集
		datas=BTS.getBytes("UTF-16LE");
		System.out.println(datas.length);
		
		datas=BTS.getBytes("GBK");
		System.out.println(datas.length);
	}
}
