package commons;
/**
 * ��ȡ����
 */
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

public class CIOTest03 {
	public static void main(String[] args) throws IOException {
		//��ȡ�ļ�
		String msg=FileUtils.readFileToString(new File("C:\\Users\\ASUS\\git\\GaoQi300\\lib\\test"),"GBK");
		System.out.println(msg);
		byte[] datas=FileUtils.readFileToByteArray(new File("C:\\\\Users\\\\ASUS\\\\git\\\\GaoQi300\\\\lib\\\\test"));
		System.out.println(datas.length);
		
		//���ж�ȡ
		List<String> msgs=FileUtils.readLines(new File("C:\\\\Users\\\\ASUS\\\\git\\\\GaoQi300\\\\lib\\\\test"),"GBK");
		for (String string : msgs) {
			System.out.println(string);
		}
		LineIterator it=FileUtils.lineIterator(new File("C:\\\\Users\\\\ASUS\\\\git\\\\GaoQi300\\\\lib\\\\test"),"GBK");
		while (it.hasNext()) {
			System.out.println(it.nextLine());
		}
	}
}
