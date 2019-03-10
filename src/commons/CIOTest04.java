package commons;
/**
 * д���ļ�
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class CIOTest04 {
	public static void main(String[] args) throws IOException {
		//д���ļ�
		FileUtils.write(new File("btsn.txt"),"bts\r\n","GBK");
		FileUtils.writeStringToFile(new File("btsn.txt"), "jjj\r\n","GBK",true);
		FileUtils.writeByteArrayToFile(new File("btsn.txt"), "hh\r\n".getBytes("GBK"),"true");
		
		//д���б�
		List<String> datas=new ArrayList<String>();
		datas.add("��͹�");
		datas.add("����");
		datas.add("����");
		
		FileUtils.writeLines("btsn.txt", datas,"--------",true);
	}
}
