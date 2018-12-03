package gof23.iterator;

public interface MyIterator {
	void first();
	void next();
	boolean hasNext();
	
	boolean isFirst();
	boolean isLast();
	
	Object grtCurrentObj();
}
