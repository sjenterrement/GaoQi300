package commons;
/**
 * 写出文件
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class CIOTest04 {
	public static void main(String[] args) throws IOException {
		//写出文件
		FileUtils.write(new File("btsn.txt"),"bts\r\n","GBK");
		FileUtils.writeStringToFile(new File("btsn.txt"), "jjj\r\n","GBK",true);
		FileUtils.writeByteArrayToFile(new File("btsn.txt"), "hh\r\n".getBytes("GBK"),"true");
		
		//写出列表
		List<String> datas=new ArrayList<String>();
		datas.add("田柾国");
		datas.add("看看");
		datas.add("方法");
		
		FileUtils.writeLines("btsn.txt", datas,"--------",true);
	}
}
