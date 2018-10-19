package simulationArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



/**
 * collection��ĸ�����ʹ��
 * collection�ǽӿڣ�collections�ǹ�����
 * @author savrina
 *
 */

public class TestCollection {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add("jungkook:"+i);
		}
		System.out.println(list);
		
		Collections.shuffle(list);//�������list�е�Ԫ��
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println(Collections.binarySearch(list, "jungkook:1"));//���ֲ��ң����ߣ��۰���� 
	}
}
