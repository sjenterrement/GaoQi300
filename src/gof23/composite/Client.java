package gof23.composite;

public class Client {
	public static void main(String[] args) {
		AbstractFile f11,f12,f21,f22;
		folder f,f1,f2;
		
		f=new folder("�ҵ��ղ�");
		f1=new folder("ͼƬ");
		f2=new folder("��Ӱ");
		
		f11=new ImageFile("bts");
		f12=new ImageFile("jisoo");
		f21=new VidioFile("�޵��ƻ���");
		f22=new VidioFile("��Һ");
		
		f1.add(f11);
		f1.add(f12);
		f2.add(f21);
		f2.add(f22);
		f.add(f1);
		f.add(f2);
		
		f.killVirus();
	}
}
