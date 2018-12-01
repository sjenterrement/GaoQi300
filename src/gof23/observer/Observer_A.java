package gof23.observer;

public class Observer_A implements Observer{

	private int mystate;
	
	public int getMystate() {
		return mystate;
	}



	public void setMystate(int mystate) {
		this.mystate = mystate;
	}



	@Override
	public void update(Subject subject) {
		mystate=((ConcreteSubject)subject).getState();
	}

}
