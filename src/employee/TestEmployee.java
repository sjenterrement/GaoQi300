package employee;

import java.util.ArrayList;
import java.util.List;

/**
 * ����empolyee��
 * @author savrina
 *
 */
public class TestEmployee {

	public static void main(String[] args) {
		//һ�������Ӧһ�м�¼
	Employee e1=new Employee(0301, "����", 3000, "��Ŀ��", "2007-10");
	Employee e2=new Employee(0302, "��ʿ��", 3500,"��ѧ��", "2006-10");
	Employee e3=new Employee(0303, "��Ѷ", 3550, "��ѧ��", "2006-10");
	
	List<Employee> list =new ArrayList<Employee>();
	
	list.add(e1);
	list.add(e2);
	list.add(e3);
	
	printEmpName(list);
	}
	
	public static void printEmpName(List<Employee> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}

	}
	
}
