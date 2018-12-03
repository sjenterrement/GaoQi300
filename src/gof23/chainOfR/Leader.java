package gof23.chainOfR;

public abstract class Leader {
	
	protected String name;
	protected Leader nextLeader;
	
	public Leader(String name) {
		super();
		this.name = name;
	}

	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	public abstract void handleRequest(LeaveRequest request);
}
