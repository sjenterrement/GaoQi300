package encode;

import java.io.UnsupportedEncodingException;

/**
 * ����
 * ���룺
 * 1.�ֽ���������
 * 2.�ַ�����ͳһ
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
		
		//���룺 �ַ�����ͳһ
		BTS = new String(datas, 0, datas.length, "utf8");
		System.out.println(BTS);
		
		//���룺�ֽ���������
		BTS = new String(datas, 0, datas.length-2, "GBK");
		System.out.println(BTS);
	}

}
