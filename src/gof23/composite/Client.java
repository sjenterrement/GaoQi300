package gof23.composite;

public class Client {
	public static void main(String[] args) {
		AbstractFile f11,f12,f21,f22;
		folder f,f1,f2;
		
		f=new folder("我的收藏");
		f1=new folder("图片");
		f2=new folder("电影");
		
		f11=new ImageFile("bts");
		f12=new ImageFile("jisoo");
		f21=new VidioFile("无敌破坏王");
		f22=new VidioFile("毒液");
		
		f1.add(f11);
		f1.add(f12);
		f2.add(f21);
		f2.add(f22);
		f.add(f1);
		f.add(f2);
		
		f.killVirus();
	}
}
