package encode;

import java.io.UnsupportedEncodingException;

/**
 * ����
 * 
 * @author SJ
 *
 */
public class ContentDecode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String BTS = "���Ͽ���˶���ɫj��֣�������ǕF��̩����͹�bts";// ʹ�ù����ַ���
		// ���룺�ֽ�����
		byte[] datas = BTS.getBytes();
		// ���룺�ַ�����String��datas,0,datas.length,charsetName��
		BTS = new String(datas, 0, datas.length, "GBK");
		System.out.println(BTS);
	}

}
