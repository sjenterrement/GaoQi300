package testException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException2 {
	public static void main(String[] args) {
		// FileReader reader=null;

		FileReader reader = null;
		try {
			reader = new FileReader("f:/TEST/a.txt");
			char temp = (char) reader.read();
			System.out.println("�������ݣ�" + temp);
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�û���ҵ�");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("�ļ���ȡ����");
			e.printStackTrace();
		} finally {
			System.out.println("������û���쳣���Ҷ��ᱻִ��");
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
