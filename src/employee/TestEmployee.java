package employee;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试empolyee类
 * @author savrina
 *
 */
public class TestEmployee {

	public static void main(String[] args) {
		//一个对象对应一行记录
	Employee e1=new Employee(0301, "高崎", 3000, "项目部", "2007-10");
	Employee e2=new Employee(0302, "马士兵", 3500,"教学部", "2006-10");
	Employee e3=new Employee(0303, "裴讯", 3550, "教学部", "2006-10");
	
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
