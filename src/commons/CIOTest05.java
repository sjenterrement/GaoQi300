package commons;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class CIOTest05 {
	public static void main(String[] args) throws IOException {
		//�����ļ�
		//FileUtils.copyFile(new File("C:\\Users\\ASUS\\git\\GaoQi300\\bts.jpg"), new File("C:\\Users\\ASUS\\git\\GaoQi300\\cccbts.jpg"));
		//�����ļ���Ŀ¼
		//FileUtils.copyFileToDirectory(new File("C:\\Users\\ASUS\\git\\GaoQi300\\bts.jpg"), new File("btsmy"));
		//����Ŀ¼��Ŀ¼
		//FileUtils.copyDirectoryToDirectory(new File("btsmy"), new File("mybts"));
		//����Ŀ¼
		//FileUtils.copyDirectory(new File("btsmy"), new File("mybts"));
		//����URL����
		String url="http://img0.imgtn.bdimg.com/it/u=1962248339,2725102193&fm=26&gp=0.jpg";
		FileUtils.copyURLToFile(new URL(url), new File("jungkook.jpg"));
	}
}
