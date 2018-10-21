package storeData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 测试表格数据的存储
 * 体会ORM的思想
 * 每一行数据都是用JavaBean对象存储，多行使用放在map或list里
 * @author savrina
 *
 */

public class TestStoreData2 {
	public static void main(String[] args) {
		BTS bts1=new BTS(01, 25, "金南俊", "里兜", "处女座");
		BTS bts2=new BTS(02, 27, "金硕珍", "搞笑", "射手座");
		BTS bts3=new BTS(03, 26, "闵玧其", "猫猫", "双鱼座");
		BTS bts4=new BTS(04, 25, "郑号锡", "hope", "水瓶座");
		BTS bts5=new BTS(05, 24, "朴智旻", "天使啊", "天枰座");
		BTS bts6=new BTS(06, 24, "金泰亨", "小老虎", "摩羯座");
		BTS bts7=new BTS(07, 22, "田柾国", "小兔子", "处女座");
		
		List<BTS> list =new ArrayList<>();
		list.add(bts1);
		list.add(bts2);
		list.add(bts3);
		list.add(bts4);
		list.add(bts5);
		list.add(bts6);
		list.add(bts7);
		
		for (BTS bts : list) {
			System.out.println(bts);
		}
		
		System.out.println("\n"+"-----------------------------");
		
		Map<String,BTS> map = new HashMap<>();
		map.put("bts1", bts1);
		map.put("bts2", bts2);
		map.put("bts3", bts3);
		map.put("bts4", bts4);
		map.put("bts5", bts5);
		map.put("bts6", bts6);
		map.put("bts7", bts7);
		
		Set<String> keyset = map.keySet();
		for (String key : keyset) {
			System.out.println(key+"--"+map.get(key));
		}
		
		
	}
}

class BTS {
	private int number;
	private int age;
	private String name;
	private String style;
	private String constellation;

	public BTS() {

	}

	public BTS(int number, int age, String name, String style, String constellation) {
		super();
		this.number = number;
		this.age = age;
		this.name = name;
		this.style = style;
		this.constellation = constellation;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getConstellation() {
		return constellation;
	}

	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}
	
	@Override
	public String toString() {
		return "number:"+number+"  name:"+name+"  age:"+age+"  style:"+style+"  constellation:"+constellation;
	}

}