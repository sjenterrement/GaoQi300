package storeData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ���Ա�����ݵĴ洢
 * ORM˼��ļ�ʵ�飺map��ʾһ�����ݣ����������Ƕ���map��������map�ŵ�list��
 * @author savrina
 *
 */

public class TestStoreData {
	public static void main(String[] args) {
		Map<String,Object> row1 = new HashMap<>();
		row1.put("����", 25);
		row1.put("����", "���Ͽ�");
		row1.put("���", "�ﶵ");
		row1.put("����", "��Ů��");
		
		Map<String,Object> row2 = new HashMap<>();
		row2.put("����", 27);
		row2.put("����", "��˶��");
		row2.put("���", "��Ц");
		row2.put("����", "������");
				
		Map<String,Object> row3 = new HashMap<>();
		row3.put("����", 26);
		row3.put("����", "�ɫj��");
		row3.put("���", "èè");
		row3.put("����", "˫����");
		
		Map<String,Object> row4 = new HashMap<>();
		row4.put("����", 25);
		row4.put("����", "֣����");
		row4.put("���", "hope");
		row4.put("����", "ˮƿ��");
		
		Map<String,Object> row5 = new HashMap<>();
		row5.put("����", 24);
		row5.put("����", "���ǕF");
		row5.put("���", "��ʹ��");
		row5.put("����", "������");
		
		Map<String,Object> row6 = new HashMap<>();
		row6.put("����", 24);
		row6.put("����", "��̩��");
		row6.put("���", "С�ϻ�");
		row6.put("����", "Ħ����");
		
		Map<String,Object> row7 = new HashMap<>();
		row7.put("����", 22);
		row7.put("����", "��͹�");
		row7.put("���", "С����");
		row7.put("����", "��Ů��");
		
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
