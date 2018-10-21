package storeData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 测试表格数据的存储
 * ORM思想的简单实验：map表示一行数据，多行数据是多行map，将多行map放到list中
 * @author savrina
 *
 */

public class TestStoreData {
	public static void main(String[] args) {
		Map<String,Object> row1 = new HashMap<>();
		row1.put("年龄", 25);
		row1.put("姓名", "金南俊");
		row1.put("风格", "里兜");
		row1.put("星座", "处女座");
		
		Map<String,Object> row2 = new HashMap<>();
		row2.put("年龄", 27);
		row2.put("姓名", "金硕珍");
		row2.put("风格", "搞笑");
		row2.put("星座", "射手座");
				
		Map<String,Object> row3 = new HashMap<>();
		row3.put("年龄", 26);
		row3.put("姓名", "闵玧其");
		row3.put("风格", "猫猫");
		row3.put("星座", "双鱼座");
		
		Map<String,Object> row4 = new HashMap<>();
		row4.put("年龄", 25);
		row4.put("姓名", "郑号锡");
		row4.put("风格", "hope");
		row4.put("星座", "水瓶座");
		
		Map<String,Object> row5 = new HashMap<>();
		row5.put("年龄", 24);
		row5.put("姓名", "朴智旻");
		row5.put("风格", "天使啊");
		row5.put("星座", "天枰座");
		
		Map<String,Object> row6 = new HashMap<>();
		row6.put("年龄", 24);
		row6.put("姓名", "金泰亨");
		row6.put("风格", "小老虎");
		row6.put("星座", "摩羯座");
		
		Map<String,Object> row7 = new HashMap<>();
		row7.put("年龄", 22);
		row7.put("姓名", "田柾国");
		row7.put("风格", "小兔子");
		row7.put("星座", "处女座");
		
		List<Map<String,Object>> table1 = new ArrayList<>();
		table1.add(row1);
		table1.add(row2);
		table1.add(row3);
		table1.add(row4);
		table1.add(row5);
		table1.add(row6);
		table1.add(row7);
		
		for (Map<String, Object> row : table1) {
			
			Set<String> keyset=row.keySet();
			
			for (String key : keyset) {
				System.out.print(key+":"+row.get(key)+"\t");
			}
			System.out.println();
		}
	}
}
