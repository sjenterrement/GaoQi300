package gof23.propotype.shallow;

import java.util.Date;

/**
 * 原型模式（浅克隆）
 * 
 * @author SJ
 *
 */
public class Sheep implements Cloneable {
	private String name;
	private Date birthday;
	
	public Sheep() {
		// TODO Auto-generated constructor stub
	}

	public Sheep(String name, Date birthday) {
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
		return obj;
	}
}
