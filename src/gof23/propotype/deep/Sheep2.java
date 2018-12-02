package gof23.propotype.deep;

import java.util.Date;

/**
 * 原型模式（浅克隆）
 * 
 * @author SJ
 *
 */
public class Sheep2 implements Cloneable {
	private String name;
	private Date birthday;
	
	public Sheep2() {
		// TODO Auto-generated constructor stub
	}

	public Sheep2(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		
		//克隆属性
		Sheep2 sheep=(Sheep2) obj;
		sheep.birthday=(Date) this.birthday.clone();
		
		return obj;
	}
}
