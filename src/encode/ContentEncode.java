package encode;

import java.io.UnsupportedEncodingException;

/**"
 * @author SJ
 * �ַ���
 *
 */
public class ContentEncode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String BTS="���Ͽ���˶���ɫj��֣�������ǕF��̩����͹�bts";//ʹ�ù����ַ���
		//���룺�ֽ�����
		byte[] datas =BTS.getBytes();
		System.out.println(datas.length);
		
		//�����ַ���
		datas=BTS.getBytes("UTF-16LE");
		System.out.println(datas.length);
		
		datas=BTS.getBytes("GBK");
		System.out.println(datas.length);
	}
}
