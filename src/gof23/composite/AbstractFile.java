package gof23.composite;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {
	void killVirus();
}

class ImageFile implements AbstractFile{
	private String name;

	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("---ͼ���ļ�"+name+",���в�ɱ��");
	}
}

class TextFile implements AbstractFile{
	private String name;

	public TextFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("---�ı��ļ�"+name+",���в�ɱ��");
	}
}

class VidioFile implements AbstractFile{
	private String name;

	public VidioFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("---��Ƶ�ļ�"+name+",���в�ɱ��");
	}
}

class folder implements AbstractFile{
	
	private String name;
	List<AbstractFile> list=new ArrayList<AbstractFile>();
	
	public folder(String name) {
		super();
		this.name = name;
	}
	
	public void add(AbstractFile file) {
		list.add(file);
	}
	
	public void remove(AbstractFile file) {
		list.remove(file);
	}
	
	public AbstractFile getChild(int index) {
		return list.get(index);
	}
	
	@Override
	public void killVirus() {
		
		System.out.println("---�ļ���"+name+",���в�ɱ��");
		
		for (AbstractFile abstractFile : list) {
			abstractFile.killVirus();
		}
	}
	
	
}