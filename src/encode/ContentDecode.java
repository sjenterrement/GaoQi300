package encode;

import java.io.UnsupportedEncodingException;

/**
 * 解码
 * 
 * @author SJ
 *
 */
public class ContentDecode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String BTS = "金南俊金硕珍闵玧其郑号锡朴智旻金泰亨田柾国bts";// 使用工程字符集
		// 编码：字节数组
		byte[] datas = BTS.getBytes();
		// 解码：字符串：String（datas,0,datas.length,charsetName）
		BTS = new String(datas, 0, datas.length, "GBK");
		System.out.println(BTS);
	}

}
