package io.decorate;
/**
 * 装饰者例一
 * @author SJ
 *
 */
public class DecorateTest1 {
	public static void main(String[] args) {
		Person p=new Person();
		p.Say();
		
		//装饰
		Amplifier am=new Amplifier(p);
		am.Say();
	}
}

interface Say{
	void Say();
}

class Person implements Say{

	//属性
	private int voice=10;
	
	public int getVoice() {
		return voice;
	}

	public void setVoice(int voice) {
		this.voice = voice;
	}

	@Override
	public void Say() {
		System.out.println("人的声音为："+this.getVoice());
	}
	
}

class Amplifier implements Say{

	private Person p;
	
	public Amplifier(Person p) {
		this.p=p;
	}
	
	@Override
	public void Say() {
		
		System.out.println("人的声音为："+p.getVoice()*100);
		System.out.println("噪音，，，");
	}
	
}